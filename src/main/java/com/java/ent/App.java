package com.java.ent;

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

    }


}
