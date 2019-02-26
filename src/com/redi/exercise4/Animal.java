package com.redi.exercise4;
import java.util.*;

class Animal {
    private Date dateCreated;
    private String nationality;
    protected String description;
    protected String voice;

    Animal(String nationality) {
        this.dateCreated = new Date();
        this.nationality = nationality;
    }

    void description(){
        if(voice!=null) {
            System.out.println("I'm a " + description + " from " + nationality + ", I was created on " + dateCreated + " and my voice sounds like *" + voice + "*.");
        }else{
            System.out.println("I'm a " + description + " from " + nationality + ", I was created on " + dateCreated + " and I don't really have a voice.");
        }
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    void speak(){
        if(voice!=null) {
            System.out.println("*" + voice + "!*");
        }else{
            System.out.println("I can't speak, I'm a " + description + "!");
        }
    }

}
