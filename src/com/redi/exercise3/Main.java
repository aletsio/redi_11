package com.redi.exercise3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ToDoList dailyTasks = new ToDoList("Daily tasks");
        dailyTasks.addTask("Wash the dishes");
        dailyTasks.addTask("Clean the apartment");
        dailyTasks.addTask("Have breakfast");
        dailyTasks.addTask("Have lunch");
        dailyTasks.addTask("Have dinner");
        dailyTasks.addTask("Go to the gym");
        dailyTasks.addTask("Do a laundry");
        dailyTasks.addTask("Practice programming");
        dailyTasks.addTask("Work at least 6 hours");
        dailyTasks.addTask("Get some fresh air");
        dailyTasks.addTask("Study German");

        Thread.sleep(1000);
        dailyTasks.info();
        Thread.sleep(1000);
        dailyTasks.complete(2);
        Thread.sleep(1000);
        dailyTasks.complete(2);
        Thread.sleep(1000);
        dailyTasks.complete(5);
        Thread.sleep(1000);
        dailyTasks.complete(1);
        Thread.sleep(1000);
        dailyTasks.uncomplete(3);
        Thread.sleep(1000);
        dailyTasks.info();
        Thread.sleep(1000);
        dailyTasks.uncomplete(2);
        Thread.sleep(1000);
        dailyTasks.info();
        Thread.sleep(1000);
        dailyTasks.completeAll();
        Thread.sleep(1000);
        dailyTasks.info();

    }
}
