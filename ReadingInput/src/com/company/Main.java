package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        //System.out.print("Age:");
        //byte age = scanner.nextByte();
        String name = scanner.nextLine().trim();
        //System.out.println("You are " + age);
        System.out.println("Your name is " + name);
    }
}
