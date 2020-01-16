package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Implicit casting (automatically converted)
        // byte > short > int > long > float > double
        // Only can occur with compatible types (numbers with numbers)
        //short x = 1;
        //int y = x + 2;

        //double x = 1.1;
        //int y = (int)x + 2;
        // To make a string work with int you need a wrapper class
        String x = "1";
        // takes a string and converts it into an integer
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
    }
}
