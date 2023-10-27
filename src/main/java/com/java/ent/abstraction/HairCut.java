package com.java.ent.abstraction;

public class HairCut extends HairStyle{
    public HairCut(String styleName) {
        super(styleName);
    }

    @Override
    public void style() {
        System.out.println("Doing this haircut: "+getStyleName());
    }
}
