package com.java.ent;

import com.java.ent.abstraction.Braid;
import com.java.ent.abstraction.HairCut;
import com.java.ent.abstraction.HairStyle;
import com.java.ent.inheritance.DigitalCamera;
import com.java.ent.inheritance.ElectronicDevice;
import com.java.ent.inheritance.InhertanceDemo;
import com.java.ent.inheritance.SmartPhone;
import com.java.ent.polymorphism.PolymorphismDemo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n INHERITANCE");
        InhertanceDemo.useInheritance();

        System.out.println("\n POLYMORPHISM");
        PolymorphismDemo demo = new PolymorphismDemo();
        demo.useOverride();
        demo.useOverload();

        System.out.println("\n ABSTRACTION");
        HairStyle bobCut = new HairCut("Bob");
        bobCut.style();
        Braid abuja = new Braid("Abuja Long");
        abuja.style();
        HairStyle conrows = new HairStyle("Short conrows") {
            @Override
            public void style() {
                System.out.println("I love doing: "+getStyleName());
            }
        };
        conrows.style();


    }


}
