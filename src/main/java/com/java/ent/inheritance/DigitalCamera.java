package com.java.ent.inheritance;

public class DigitalCamera extends ElectronicDevice {

    @Override
    public void powerOn() {
        System.out.println("Camera turned on!");
    }
}
