package com.java.ent;

import com.java.ent.inheritance.DigitalCamera;
import com.java.ent.inheritance.ElectronicDevice;
import com.java.ent.inheritance.SmartPhone;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SmartPhone nokia = new SmartPhone();
        nokia.powerOn(); // calling method override
        nokia.powerOff(); //calling super class method
        nokia.makeCall(); // calling child class method
        System.out.println("\n");

        ElectronicDevice canon = new DigitalCamera();
        canon.powerOn(); // calling method override
        canon.powerOff(); // calling super class method

    }
}
