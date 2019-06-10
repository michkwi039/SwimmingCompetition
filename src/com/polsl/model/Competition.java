package com.polsl.model;

public class Competition {
    private int ID;
    private String style;
    private int swimmingDistance;

    public Competition(int ID, String style, int swimmingDistance) {
        this.ID = ID;
        this.style = style;
        this.swimmingDistance = swimmingDistance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getSwimmingDistance() {
        return swimmingDistance;
    }

    public void setSwimmingDistance(int swimmingDistance) {
        this.swimmingDistance = swimmingDistance;
    }
}
