package com.itproger;

public interface Shape {

    //public static constant field
    double PI = 3.14;
    String NAME = "Shape";

    double calculateArea();


    default double calcPerimeter(){
        return 0;
    }

}
