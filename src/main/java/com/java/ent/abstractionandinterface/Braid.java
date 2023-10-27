package com.java.ent.abstractionandinterface;

public class Braid extends HairStyle implements Updo {
    public Braid(String styleName) {
        super(styleName);
    }

    @Override
    public void style() {
        System.out.println("Applying this braid: " + getStyleName());
    }


    @Override
    public void makePonytail() {
        System.out.println("Add a ponytail to the braid");
    }


}
