package com.itproger;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {

        return 2 * Math.PI * radius;
    }

}
