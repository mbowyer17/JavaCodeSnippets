package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code her
        /*
        Types   Bytes    Min    Max
        byte	1       -128	127
        char	2     	A,B,C...
        short	2	    -32k 	32k
        int		4       -2B      2B
        float	4	    -2B      2B
        long	8	    -9,223,372,036,854,775,808	+9,223,372,036,854,775,807
        double	16      (large number)
        boolean	1       false   true
         */

        byte age = 30;
        // Use a underscore ("_") to seperate every 3 digits
        // Use l for long types seperates the numbers for readiblity
        long viewsCount = 3_123_456_789l;
        float price = 10.99f;
        char letter = 'A';
        boolean isEligible = true;

        System.out.println(viewsCount);
    }
}
