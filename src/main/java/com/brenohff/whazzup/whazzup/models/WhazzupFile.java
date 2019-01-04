package com.brenohff.whazzup.whazzup.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

/**
 * Created by breno.franco on 03/01/2019
 */

public class WhazzupFile implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private String[] generalData;
    @JsonIgnore
    private String[] clientsData;
    @JsonIgnore
    private String[] airportsData;
    @JsonIgnore
    private String[] serversData;

    private List<IvaoPilot> ivaoPilots;
    private List<IvaoATC> ivaoATCS;

    public WhazzupFile() {
    }

    public WhazzupFile(String[] generalData, String[] clientsData, String[] airportsData, String[] serversData) {
        this.generalData = generalData;
        this.clientsData = clientsData;
        this.airportsData = airportsData;
        this.serversData = serversData;
    }

    public String[] getGeneralData() {
        return generalData;
    }

    public void setGeneralData(String[] generalData) {
        this.generalData = generalData;
    }

    public String[] getClientsData() {
        return clientsData;
    }

    public void setClientsData(String[] clientsData) {
        this.clientsData = clientsData;
    }

    public String[] getAirportsData() {
        return airportsData;
    }

    public void setAirportsData(String[] airportsData) {
        this.airportsData = airportsData;
    }

    public String[] getServersData() {
        return serversData;
    }

    public void setServersData(String[] serversData) {
        this.serversData = serversData;
    }

    public List<IvaoPilot> getIvaoPilots() {
        return ivaoPilots;
    }

    public void setIvaoPilots(List<IvaoPilot> ivaoPilots) {
        this.ivaoPilots = ivaoPilots;
    }

    public List<IvaoATC> getIvaoATCS() {
        return ivaoATCS;
    }

    public void setIvaoATCS(List<IvaoATC> ivaoATCS) {
        this.ivaoATCS = ivaoATCS;
    }
}