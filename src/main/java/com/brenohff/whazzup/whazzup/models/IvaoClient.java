package com.brenohff.whazzup.whazzup.models;

import com.brenohff.whazzup.whazzup.enums.ClientType;

import java.io.Serializable;

/**
 * Created by breno.franco on 03/01/2019
 */

public class IvaoClient implements Serializable {
    private static final long serialVersionUID = 1L;


    private Integer vid;
    private String callsign;
    private String name;
    private ClientType client;
    private Long latitude;
    private Long longitude;
    private Integer altitude;
    private String server;
    private String protocol;
    private String combinedRating;

    private String connectionTime;
    private String softwareName;
    private String softwareVersion;
    private String administrativeVersion;
    private String atcPilotVersion;


}