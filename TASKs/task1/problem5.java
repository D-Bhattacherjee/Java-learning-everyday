import java.util.Scanner;

/**
 * PROBLEM STATEMENT 5- Count Nth term to 0
 */
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to start counting toward 0 :\t");
        int Nth = sc.nextInt();
        sc.close();

        for (int i = Nth; i >= 0; --i) {
            System.out.println("Count :\t" + i);
        }
    }
}
