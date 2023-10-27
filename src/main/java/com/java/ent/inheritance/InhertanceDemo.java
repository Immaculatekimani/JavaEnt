package com.java.ent.inheritance;

public class InhertanceDemo {
    public static void useInheritance() {
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
