package com.brenohff.whazzup.whazzup.enums;

/**
 * Created by breno.franco on 03/01/2019
 */

public enum PilotRating {

    OBSERVER("1"),
    FS1("2"),
    FS2("3"),
    FS3("4"),
    PP("5"),
    SPP("6"),
    CP("7"),
    ATP("8"),
    SFI("9"),
    CFI("10");

    private final String pilotRating;

    PilotRating(String pilotRating) {
        this.pilotRating = pilotRating;
    }

    public static PilotRating fromString(String text) {
        for (PilotRating b : PilotRating.values()) {
            if (b.pilotRating.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}