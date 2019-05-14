package com.polsl.model;

public class Swimmer {
    public String name;
    public String surname;
    public char gender;
    public int age;
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
}
