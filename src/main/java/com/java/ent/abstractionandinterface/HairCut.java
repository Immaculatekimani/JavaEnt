package com.java.ent.abstractionandinterface;

public class HairCut extends HairStyle implements Dye {
    public HairCut(String styleName) {
        super(styleName);
    }

    @Override
    public void style() {
        System.out.println("Doing this haircut: " + getStyleName());
    }


    @Override
    public void changeColor(String colorName) {
        System.out.println("Apply "+colorName+" color to the "+getStyleName());
    }
}
