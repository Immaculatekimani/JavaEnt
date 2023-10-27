package com.java.ent;

import com.java.ent.abstractionandinterface.*;
import com.java.ent.inheritance.InhertanceDemo;
import com.java.ent.polymorphism.PolymorphismDemo;

public class App {
    public static void main(String[] args) {
        System.out.println("\n INHERITANCE");
        InhertanceDemo.useInheritance();

        System.out.println("\n POLYMORPHISM");
        PolymorphismDemo demo = new PolymorphismDemo();
        demo.useOverride();
        demo.useOverload();

        System.out.println("\n ABSTRACTION");
        AbstractionAndInterfaceDemo demo1 = new AbstractionAndInterfaceDemo();
        demo1.useAbstraction();
        demo1.useInterfaces();

    }


}
