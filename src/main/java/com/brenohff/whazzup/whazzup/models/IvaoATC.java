package com.brenohff.whazzup.whazzup.models;

import com.brenohff.whazzup.whazzup.enums.AtcRating;
import com.brenohff.whazzup.whazzup.enums.ClientType;
import com.brenohff.whazzup.whazzup.enums.FacilityType;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by breno.franco on 03/01/2019
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IvaoATC extends IvaoClient {

    private String frequency;
    private FacilityType facilityType;
    private AtcRating atcRating;
    private String visualRange;
    private String atis;

    public IvaoATC(String[] atcData) {
        setCallsign(atcData[0]);
        setVid(atcData[1]);
        setName(atcData[2]);
        setClient(ClientType.valueOf(atcData[3]));
        setLatitude(atcData[5].isEmpty() ? 0.0 : Double.parseDouble(atcData[5]));
        setLongitude(atcData[6].isEmpty() ? 0.0 : Double.parseDouble(atcData[6]));
        setAltitude(atcData[7].isEmpty() ? 0 : Integer.parseInt(atcData[7]));

        this.frequency = atcData[4];
        this.facilityType = FacilityType.fromString(atcData[18]);
        this.atcRating = AtcRating.fromString(atcData[16]);
        this.visualRange = atcData[19];
        this.atis = atcData[35];

        setSoftwareName(atcData[38]);
        setSoftwareVersion(atcData[39]);

    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public AtcRating getAtcRating() {
        return atcRating;
    }

    public void setAtcRating(AtcRating atcRating) {
        this.atcRating = atcRating;
    }

    public String getVisualRange() {
        return visualRange;
    }

    public void setVisualRange(String visualRange) {
        this.visualRange = visualRange;
    }

    public String getAtis() {
        return atis;
    }

    public void setAtis(String atis) {
        this.atis = atis;
    }
}