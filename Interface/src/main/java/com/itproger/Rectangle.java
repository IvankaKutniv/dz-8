package com.itproger;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }



    public String hiFromRect() {
        return "hi from rectangle";
    }


    @Override
    public double calcPerimeter(){
        return 2 * (width + height);
    }

}
