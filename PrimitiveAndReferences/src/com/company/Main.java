package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Reference types are copied by the references
        // Primitive types are copied by their value
        Point point1 = new Point(1,1); // new Point(1,1) is a object
        // point1 and point2 are referencing the same object
        Point point2 = point1; // Copies the value from point1 into point2
        point1.x = 2;
        System.out.println(point2);
    }
}
