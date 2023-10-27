package com.java.ent.inheritance;

public class SmartPhone extends ElectronicDevice{

    @Override
    public  void powerOn(){
        super.fullCharge();
        System.out.println("Smartphone turned on!");
    }
    public void makeCall(){
        System.out.println("A call is in progress");
    }
}
