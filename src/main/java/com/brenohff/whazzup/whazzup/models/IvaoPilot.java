package com.brenohff.whazzup.whazzup.models;

import com.brenohff.whazzup.whazzup.enums.ClientType;
import com.brenohff.whazzup.whazzup.enums.FlightSimulatorType;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by breno.franco on 03/01/2019
 */

public class IvaoPilot extends IvaoClient {

    private Integer groundspeed;
    private String aircraft;
    private String cruisingSpeed;
    private String cruisingLevel;
    private String departureAerodrome;
    private String destinationAerodrome;
    private String transponderCode;
    private String heading;
    private FlightSimulatorType simulator;
    private String plane;
    private boolean onGround;

    private String revision;
    private String flightRules;
    private String departureTime;
    private String actualDepartureTime;
    private String eetHours;
    private String eetMinutes;
    private String enduranceHours;
    private String enduranceMinutes;
    private String alternateAerodrome;
    private String otherInfo;
    private String route;
    private String alternateAerodrome2nd;
    private String typeOfFlight;
    private String personsOnBoard;

    DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");

    public IvaoPilot(String[] pilotData) {
        setCallsign(pilotData[0]);
        setVid(pilotData[1]);
        setName(pilotData[2]);
        setClient(ClientType.valueOf(pilotData[3]));
        setLatitude(Double.parseDouble(pilotData[5]));
        setLongitude(Double.parseDouble(pilotData[6]));
        setAltitude(Integer.parseInt(pilotData[7]));

        this.groundspeed = Integer.parseInt(pilotData[8]);
        this.aircraft = pilotData[9].isEmpty() ? "" : (pilotData[9].split("/"))[1];
        this.cruisingSpeed = pilotData[10];
        this.departureAerodrome = pilotData[11];
        this.cruisingLevel = pilotData[12];
        this.destinationAerodrome = pilotData[13];

        setServer(pilotData[14]);
        setProtocol(pilotData[15]);

        this.transponderCode = pilotData[17];
        this.revision = pilotData[20];
        this.flightRules = pilotData[21];
        this.departureTime = pilotData[22];
        this.actualDepartureTime = pilotData[23];
        this.eetHours = pilotData[24];
        this.eetMinutes = pilotData[25];
        this.enduranceHours = pilotData[26];
        this.enduranceMinutes = pilotData[27];
        this.alternateAerodrome = pilotData[28];
        this.otherInfo = pilotData[29];
        this.route = pilotData[30];

        try {
            setConnectionTime(dateFormat.parse(pilotData[37]));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        setSoftwareName(pilotData[38]);
        setSoftwareVersion(pilotData[39]);
//        setAdministrativeVersion(AdministrativeRating.valueOf(pilotData[40]));

        this.alternateAerodrome2nd = pilotData[42];
        this.typeOfFlight = pilotData[43];
        this.personsOnBoard = pilotData[44];
        this.heading = pilotData[45];
        this.onGround = pilotData[46].equals("1");
//        this.simulator = FlightSimulatorType.valueOf(pilotData[47]);

    }

    //region GETTERS AND SETTERS

    public Integer getGroundspeed() {
        return groundspeed;
    }

    public void setGroundspeed(Integer groundspeed) {
        this.groundspeed = groundspeed;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(String cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    public String getCruisingLevel() {
        return cruisingLevel;
    }

    public void setCruisingLevel(String cruisingLevel) {
        this.cruisingLevel = cruisingLevel;
    }

    public String getDepartureAerodrome() {
        return departureAerodrome;
    }

    public void setDepartureAerodrome(String departureAerodrome) {
        this.departureAerodrome = departureAerodrome;
    }

    public String getDestinationAerodrome() {
        return destinationAerodrome;
    }

    public void setDestinationAerodrome(String destinationAerodrome) {
        this.destinationAerodrome = destinationAerodrome;
    }

    public String getTransponderCode() {
        return transponderCode;
    }

    public void setTransponderCode(String transponderCode) {
        this.transponderCode = transponderCode;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public FlightSimulatorType getSimulator() {
        return simulator;
    }

    public void setSimulator(FlightSimulatorType simulator) {
        this.simulator = simulator;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public void setOnGround(boolean onGround) {
        this.onGround = onGround;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getFlightRules() {
        return flightRules;
    }

    public void setFlightRules(String flightRules) {
        this.flightRules = flightRules;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getActualDepartureTime() {
        return actualDepartureTime;
    }

    public void setActualDepartureTime(String actualDepartureTime) {
        this.actualDepartureTime = actualDepartureTime;
    }

    public String getEetHours() {
        return eetHours;
    }

    public void setEetHours(String eetHours) {
        this.eetHours = eetHours;
    }

    public String getEetMinutes() {
        return eetMinutes;
    }

    public void setEetMinutes(String eetMinutes) {
        this.eetMinutes = eetMinutes;
    }

    public String getEnduranceHours() {
        return enduranceHours;
    }

    public void setEnduranceHours(String enduranceHours) {
        this.enduranceHours = enduranceHours;
    }

    public String getEnduranceMinutes() {
        return enduranceMinutes;
    }

    public void setEnduranceMinutes(String enduranceMinutes) {
        this.enduranceMinutes = enduranceMinutes;
    }

    public String getAlternateAerodrome() {
        return alternateAerodrome;
    }

    public void setAlternateAerodrome(String alternateAerodrome) {
        this.alternateAerodrome = alternateAerodrome;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getAlternateAerodrome2nd() {
        return alternateAerodrome2nd;
    }

    public void setAlternateAerodrome2nd(String alternateAerodrome2nd) {
        this.alternateAerodrome2nd = alternateAerodrome2nd;
    }

    public String getTypeOfFlight() {
        return typeOfFlight;
    }

    public void setTypeOfFlight(String typeOfFlight) {
        this.typeOfFlight = typeOfFlight;
    }

    public String getPersonsOnBoard() {
        return personsOnBoard;
    }

    public void setPersonsOnBoard(String personsOnBoard) {
        this.personsOnBoard = personsOnBoard;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    //endregion
}
