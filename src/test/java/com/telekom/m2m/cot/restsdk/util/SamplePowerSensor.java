package com.telekom.m2m.cot.restsdk.util;

public class SamplePowerSensor {

    private final MeasurementValue solar;

    public SamplePowerSensor(MeasurementValue solar) {
        this.solar = solar;
    }

    public MeasurementValue getSolar() {
        return solar;
    }
}
