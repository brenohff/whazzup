package com.brenohff.whazzup.whazzup.models;

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
    private boolean onGround;
    private String simulator;
    private String plane;

    private String fpRevision;
    private String fpFlightRules;
    private String fpDepartureTime;
    private String fpActualDepartureTime;
    private String fpEETHours;
    private String fpEETMinutes;
    private String fpEnduranceHours;
    private String fpEnduranceMinutes;
    private String fpAlternateAerodrome;
    private String fpOtherInfo;
    private String fpRoute;
    private String fp2ndAlternateAerodrome;
    private String fpTypeOfFlight;
    private String fpPersonsOnBoard;


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

    public String getFpRevision() {
        return fpRevision;
    }

    public void setFpRevision(String fpRevision) {
        this.fpRevision = fpRevision;
    }

    public String getFpFlightRules() {
        return fpFlightRules;
    }

    public void setFpFlightRules(String fpFlightRules) {
        this.fpFlightRules = fpFlightRules;
    }

    public String getFpDepartureTime() {
        return fpDepartureTime;
    }

    public void setFpDepartureTime(String fpDepartureTime) {
        this.fpDepartureTime = fpDepartureTime;
    }

    public String getFpActualDepartureTime() {
        return fpActualDepartureTime;
    }

    public void setFpActualDepartureTime(String fpActualDepartureTime) {
        this.fpActualDepartureTime = fpActualDepartureTime;
    }

    public String getFpEETHours() {
        return fpEETHours;
    }

    public void setFpEETHours(String fpEETHours) {
        this.fpEETHours = fpEETHours;
    }

    public String getFpEETMinutes() {
        return fpEETMinutes;
    }

    public void setFpEETMinutes(String fpEETMinutes) {
        this.fpEETMinutes = fpEETMinutes;
    }

    public String getFpEnduranceHours() {
        return fpEnduranceHours;
    }

    public void setFpEnduranceHours(String fpEnduranceHours) {
        this.fpEnduranceHours = fpEnduranceHours;
    }

    public String getFpEnduranceMinutes() {
        return fpEnduranceMinutes;
    }

    public void setFpEnduranceMinutes(String fpEnduranceMinutes) {
        this.fpEnduranceMinutes = fpEnduranceMinutes;
    }

    public String getFpAlternateAerodrome() {
        return fpAlternateAerodrome;
    }

    public void setFpAlternateAerodrome(String fpAlternateAerodrome) {
        this.fpAlternateAerodrome = fpAlternateAerodrome;
    }

    public String getFpOtherInfo() {
        return fpOtherInfo;
    }

    public void setFpOtherInfo(String fpOtherInfo) {
        this.fpOtherInfo = fpOtherInfo;
    }

    public String getFpRoute() {
        return fpRoute;
    }

    public void setFpRoute(String fpRoute) {
        this.fpRoute = fpRoute;
    }

    public String getFp2ndAlternateAerodrome() {
        return fp2ndAlternateAerodrome;
    }

    public void setFp2ndAlternateAerodrome(String fp2ndAlternateAerodrome) {
        this.fp2ndAlternateAerodrome = fp2ndAlternateAerodrome;
    }

    public String getFpTypeOfFlight() {
        return fpTypeOfFlight;
    }

    public void setFpTypeOfFlight(String fpTypeOfFlight) {
        this.fpTypeOfFlight = fpTypeOfFlight;
    }

    public String getFpPersonsOnBoard() {
        return fpPersonsOnBoard;
    }

    public void setFpPersonsOnBoard(String fpPersonsOnBoard) {
        this.fpPersonsOnBoard = fpPersonsOnBoard;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public void setOnGround(boolean onGround) {
        this.onGround = onGround;
    }

    public String getSimulator() {
        return simulator;
    }

    public void setSimulator(String simulator) {
        this.simulator = simulator;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }
}
