package com.brenohff.whazzup.whazzup.enums;

/**
 * Created by breno.franco on 03/01/2019
 */

public enum FacilityType {

    privObserver("0"),
    privFlightInformation("1"),
    privDelivery("2"),
    privGround("3"),
    privTower("4"),
    privApproach("5"),
    privACC("6"),
    privDeparture("7");

    private final String facilityType;

    FacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public static FacilityType fromString(String text) {
        for (FacilityType b : FacilityType.values()) {
            if (b.facilityType.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

}
