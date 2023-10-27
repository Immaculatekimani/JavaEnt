package com.java.ent.abstractionandinterface;

public abstract class HairStyle {
    private String styleName;

    public HairStyle(String styleName) {
        this.styleName = styleName;
    }

    public String getStyleName() {
        return styleName;
    }



    public abstract void style();

}
