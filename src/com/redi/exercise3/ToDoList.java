package com.redi.exercise3;
import java.util.*;

class ToDoList {
    private String name;
    private ArrayList<Task> tasks;
    private int maxItems;

    ToDoList(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
        this.maxItems = 10;
    }

    //Add a task to the list.
    void addTask(String text){
        if(maxItems-tasks.size()!=0) {
            tasks.add(new Task(text));
        }else{
            System.out.println("You cannot add any more tasks!");
        }
    }

    //Show information about the to-do list.
    void info(){
        System.out.println("This to-do list (" + name + ") contains the following tasks: ");
        int i=1;
        for(Task t : tasks){
            System.out.println(i + ". " + t.info());
            i++;
        }
    }

    //Get task #i from the ArrayList tasks.
    private Task getTask(int i){
        return tasks.get(i-1);
    }

    //Mark all tasks as completed.
    void completeAll(){
        for(Task t : tasks){
            t.complete();
        }
        System.out.println("You completed all your tasks!");
    }

    //Mark all tasks as pending.
    void uncompleteAll(){
        for(Task t : tasks){
            t.uncomplete();
        }
        System.out.println("All tasks are now marked as pending!");
    }

    //Complete task if pending.
    void complete(int i) {
        Task taskToUpdate = getTask(i);
        if (taskToUpdate.isCompleted()) {
            System.out.println("You already completed this task (#" + i + ") on " + taskToUpdate.getDateUpdated() + "!");
        } else {
            taskToUpdate.complete();
            System.out.println("This task (#" + i + ") is now completed!");
        }
    }

    //Mark task as pending if completed.
    void uncomplete(int i){
            Task taskToUpdate = getTask(i);
            if(!taskToUpdate.isCompleted()){
                System.out.println("This task (#" + i + ") is already marked as pending!");
            }else {
                taskToUpdate.uncomplete();
                System.out.println("This task (#" + i + ") is now pending!");
            }
    }

}
