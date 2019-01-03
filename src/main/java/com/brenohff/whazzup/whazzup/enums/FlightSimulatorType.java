package com.brenohff.whazzup.whazzup.enums;

/**
 * Created by breno.franco on 03/01/2019
 */

public enum FlightSimulatorType {

    Unknown(0),
    FS95(1),
    FS98(2),
    CFS(3),
    FS2000(4),
    CFS2(5),
    FS2002(6),
    CFS3(7),
    FS2004(8),
    FSX(9),
    XPlaneUnknown(11),
    XPlane8(12),
    XPlane9(13),
    XPlane10(14),
    PS1(15),
    XPlane11(16),
    XPlane12(17),
    Fly(20),
    Fly2(21),
    FlightGear(25),
    Prepar3D1(30);

    private final Integer flightSimulatorType;

    FlightSimulatorType(Integer flightSimulatorType) {
        this.flightSimulatorType = flightSimulatorType;
    }

}
