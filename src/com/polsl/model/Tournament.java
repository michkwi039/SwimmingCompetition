package com.polsl.model;


import java.sql.Date;

public class Tournament {

     private int ID;
     private int numberOfRuns;
     private Date date ;

    public Tournament(int ID, int numberOfRuns, Date date) {
        this.ID = ID;
        this.numberOfRuns = numberOfRuns;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumberOfRuns() {
        return numberOfRuns;
    }

    public void setNumberOfRuns(int numberOfRuns) {
        this.numberOfRuns = numberOfRuns;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
