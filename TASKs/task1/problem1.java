
/**
 * PROBLEM STATEMENT 1- Take user input for variable gallons and convert it to
 * litres;
 * output the conversion - X Gallons = Y Litres
 * 
 * [1 gallon = 3.7854 litres]
 */

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of gallons to convert:\t");
        double gallon = sc.nextDouble();
        sc.close();

        double litres = gallon * 3.7854;

        // normarl way to print
        System.out.println(gallon + " Gallons = " + litres + " Litres");

        // by rounding the digits using Math.round()
        System.out.println(gallon + " Gallons = " + Math.round(litres) + " Litres");

        // Way 2 of rounding using printf statement
        System.out.printf(gallon + " Gallons\t=\t%.2f Litres\n", litres);

        // Way 3 of rounding using String.format() method
        System.out.println(gallon + " Gallons\t=\t " + String.format("%.2f", litres));
    }
}
/**
 * 
 * #/%.2f (Floating-Point Formatting)/#
 * This part formats a floating-point number (like double or float).
 * 
 * %: Indicates the start of a format specifier.
 * .2: Specifies the precision, meaning exactly 2 digits will appear after the
 * decimal point. The number is rounded automatically (e.g., 45.4248 becomes
 * 45.42).
 * f: Stands for floating-point, telling Java to expect a decimal number.
 * %n: for newline
 */
