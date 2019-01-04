package com.brenohff.whazzup.whazzup.enums;

/**
 * Created by breno.franco on 03/01/2019
 */

public enum AtcRating {

    Observer("1"),
    AS1("2"),
    AS2("3"),
    AS3("4"),
    ADC("5"),
    APC("6"),
    ACC("7"),
    SEC("8"),
    SAI("9"),
    CAI("10");

    private final String atcRating;

    AtcRating(String atcRating) {
        this.atcRating = atcRating;
    }

    public static AtcRating fromString(String text) {
        for (AtcRating b : AtcRating.values()) {
            if (b.atcRating.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

}