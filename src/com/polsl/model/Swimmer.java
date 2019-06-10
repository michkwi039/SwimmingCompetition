package com.polsl.model;

public class Swimmer {
    private String name;
    private String surname;
    private char gender;
    private int age;
    public Swimmer(String name, String surname, char gender, int age){
        this.name=name;
        this.surname=surname;
        this.gender=gender;
        this.age=age;
    }
    public Swimmer(){
        this.name="Jan";
        this.surname="Kowalski";
        this.gender='M';
        this.age=20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
