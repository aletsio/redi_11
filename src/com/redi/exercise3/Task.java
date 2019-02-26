package com.redi.exercise3;

import java.util.*;

public class Task {
    private String text;
    private Date dateCreated;
    private Date dateUpdated;
    private boolean completed;

    Task(String text) {
        this.text = text;
        this.dateCreated = new Date();
        this.completed = false;
        this.dateUpdated = dateCreated;
    }

    //Mark task as completed.
    void complete(){
        completed=true;
        dateUpdated = new Date();
    }

    //Mark task as pending.
    void uncomplete(){
        completed=false;
        dateUpdated = new Date();
    }

    //Show information about task.
    String info(){
        if(dateUpdated==dateCreated){
            return text + " [created on " + dateCreated + ", never updated.]";
        }else {
            return text + " [created on " + dateCreated + ", updated on " + dateUpdated + " (marked as " + getLastChange() + ")].";
        }
    }

    String getText() {
        return text;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    Date getDateUpdated() {
        return dateUpdated;
    }

    boolean isCompleted() {
        return completed;
    }

    //Get current status as a string.
    private String getLastChange() {
        String lastChange;
        if(completed){
            lastChange="completed";
        }else{
            lastChange="pending";
        }
        return lastChange;
    }

    //Set status.
    void setCompleted(boolean status){
        completed=status;
    }

}
