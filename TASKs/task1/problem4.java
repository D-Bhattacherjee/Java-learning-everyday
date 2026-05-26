import java.util.Scanner;

/**
 * PROBLEM STATEMENT 4- Count 0 to Nth term
 */

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to start counting from 0 :\t");
        int Nth = sc.nextInt();
        sc.close();

        for (int i = 0; i <= Nth; i++) {
            System.out.println("Count :\t" + i);
        }
    }
}
