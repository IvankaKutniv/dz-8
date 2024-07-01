package com.itproger;

public class Bike extends Vehicle {

    public Bike(String model, int year) {

        super(model, year);
    }

    @Override
    public void move() {

        System.out.println("zfdfzzzzzzzzzz");
    }

    @Override
    public void displayInfo() {

        System.out.println("Bike was build in the " + this.year);
    }

}
