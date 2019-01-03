package com.brenohff.whazzup.whazzup.enums;

/**
 * Created by breno.franco on 03/01/2019
 */

public enum AdministrativeRating {

    Suspended(0),
    Observer(1),
    User(2),
    Supervisor(11),
    Administrator(12);

    private final Integer administrativeRating;

    AdministrativeRating(Integer administrativeRating) {
        this.administrativeRating = administrativeRating;
    }

}