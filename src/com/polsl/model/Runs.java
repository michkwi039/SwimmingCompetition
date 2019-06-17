package com.polsl.model;

public class Runs {
    private int ID;
    private char gender;
    private char ageGroup;
    private Scores scores;
    private Competition competition;

    public Runs(int ID, char gender, char ageGroup, Scores scores, Competition competition) {
        this.ID = ID;
        this.gender = gender;
        this.ageGroup = ageGroup;
        this.scores = scores;
        this.competition = competition;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(char ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
}
