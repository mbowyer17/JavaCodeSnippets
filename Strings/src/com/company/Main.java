package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Shortcut to initialise a string variable in java (new String("Hello World"))
        // Parameters are the holes we define in our methods
        // Arguments are the values that we pass through methods
        // In java strings are immutable meaning they cant be changed
        // Any methods modifying a string creates a new string object
        String message = "  Hello World" + "!!";

        //System.out.println(message);
        //System.out.println(message.endsWith("!!"))
        //System.out.println(message.length());
        //System.out.println(message.indexOf("l"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        //System.out.println("String Value");
    }
}
