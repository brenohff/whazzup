package com.brenohff.whazzup.whazzup.enums;

/**
 * Created by breno.franco on 03/01/2019
 */

public enum ClientType {

    ATC("ATC"),
    PILOT("PILOT"),
    FOLME("FOLME");

    private final String clientType;

    ClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientType() {
        return clientType;
    }
}
