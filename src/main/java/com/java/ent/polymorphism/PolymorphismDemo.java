package com.java.ent.polymorphism;

import com.java.ent.inheritance.ElectronicDevice;
import com.java.ent.inheritance.SmartPhone;

public class PolymorphismDemo {
    public void useOverride() {
        ElectronicDevice iTel = new SmartPhone();
        iTel.powerOn();
    }

    public void useOverload() {
        SmartPhone samsung = new SmartPhone();
        samsung.makeCall("Susan"); // with parameters
        samsung.makeCall(); //without parameters
    }
}
