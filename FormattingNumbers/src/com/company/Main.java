package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        //String result = currency.format(213123412);
        String result = NumberFormat.getCurrencyInstance().format(2000000);
        System.out.println(result);
    }
}
