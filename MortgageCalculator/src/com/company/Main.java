package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final byte MONTHS_IN_YEAR = 12;
        final byte PERRCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: " );
        int principle = scanner.nextInt();


        System.out.print("Interest Rate: " );
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERRCENT / MONTHS_IN_YEAR;

        System.out.print("Peiod(Years): " );
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments)- 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
