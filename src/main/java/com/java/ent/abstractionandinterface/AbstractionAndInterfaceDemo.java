package com.java.ent.abstractionandinterface;

public class AbstractionAndInterfaceDemo {
    public void useAbstraction() {
        HairStyle bobCut = new HairCut("Bob");
        bobCut.style();

        // creating an abstract class object
        HairStyle conrows = new HairStyle("Short conrows") {
            @Override
            public void style() {
                System.out.println("I love doing: " + getStyleName());
            }
        };
        conrows.style();
    }

    public void useInterfaces() {
        //A braid object
        Braid abuja = new Braid("Abuja Long");
        abuja.style();
        abuja.makePonytail(); //using Up-do interface

        //Using Dye interface
        Dye mohawk = new HairCut("Mohawk");
        mohawk.changeColor("Blonde");
        Dye crewCut = new HairCut("Crew Cut");
        crewCut.changeColor("Blue");
    }

}
