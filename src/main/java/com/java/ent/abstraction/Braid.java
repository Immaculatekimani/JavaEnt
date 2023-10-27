package com.java.ent.abstraction;

public class Braid extends HairStyle {
    public Braid(String styleName) {
        super(styleName);
    }

    @Override
    public void style() {
        System.out.println("Applying this braid: " + getStyleName());
    }


}
