package com.itproger;

public abstract class Vehicle {

    private String model;
    public int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public abstract void move();

    public void displayInfo(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
