import java.util.Scanner;

/**
 * PROBLEM STATEMENT 3 - Take input of a digit and check if it is Positive or
 * not
 */

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check if it is Positive :\t");
        int digit = sc.nextInt();

        if (digit >= 0) {
            System.out.println(digit + " is positive");
        } else {
            System.out.println(digit + " is negative");
        }
        sc.close();
    }
}
