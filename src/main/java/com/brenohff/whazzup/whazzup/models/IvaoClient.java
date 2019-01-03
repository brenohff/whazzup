package com.brenohff.whazzup.whazzup.models;

import com.brenohff.whazzup.whazzup.enums.AdministrativeRating;
import com.brenohff.whazzup.whazzup.enums.ClientType;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by breno.franco on 03/01/2019
 */

public class IvaoClient implements Serializable {
    private static final long serialVersionUID = 1L;


    private String callsign;
    private String vid;
    private String name;
    private ClientType client;
    private Double latitude;
    private Double longitude;
    private Integer altitude;
    private String server;
    private String protocol;

    private Date connectionTime;
    private String softwareName;
    private String softwareVersion;
    private AdministrativeRating administrativeVersion;

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getClient() {
        return client;
    }

    public void setClient(ClientType client) {
        this.client = client;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Date getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(Date connectionTime) {
        this.connectionTime = connectionTime;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public AdministrativeRating getAdministrativeVersion() {
        return administrativeVersion;
    }

    public void setAdministrativeVersion(AdministrativeRating administrativeVersion) {
        this.administrativeVersion = administrativeVersion;
    }
}