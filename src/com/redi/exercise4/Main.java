package com.redi.exercise4;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Cat cat1 = new Cat("Italy");
        Thread.sleep(1000);
        Dog dog1 = new Dog("France");
        Thread.sleep(1000);
        Dog dog2 = new Dog("Greece");
        Thread.sleep(1000);
        Rabbit rabbit1 = new Rabbit("Germany");

        cat1.description();
        rabbit1.description();
        dog2.speak();
        rabbit1.speak();

    }
}
