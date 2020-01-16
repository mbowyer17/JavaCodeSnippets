package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Integer Array with 5 items
        int[] numbers = {2, 3, 5, 1, 4};
        Arrays.sort(numbers);
        /* Old Way
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        */

        // to display string representation of an array
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);
    }
}
