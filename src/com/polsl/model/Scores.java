package com.polsl.model;

import java.sql.Time;
import java.util.ArrayList;

public class Scores {
    private int ID;
    private int winnerID;
    private Time time;
    private ArrayList<Swimmer> participants;

    public Scores(int ID, int winnerID, Time time, ArrayList<Swimmer> participants) {
        this.ID = ID;
        this.winnerID = winnerID;
        this.time = time;
        this.participants = participants;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getWinnerID() {
        return winnerID;
    }

    public void setWinnerID(int winnerID) {
        this.winnerID = winnerID;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public ArrayList<Swimmer> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Swimmer> participants) {
        this.participants = participants;
    }
}
