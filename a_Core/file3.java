import java.util.Scanner;

public class file3 {
    // let's take some user inputs and calculate
    public static void main(String[] args) {
        System.out.println("\n----------------------------------\n");

        // Making Scanner object for taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:\t");
        int num1 = sc.nextInt();

        System.out.print("Enter another number:\t");
        int num2 = sc.nextInt();

        System.out.println("Sum of \t" + num1 + " and " + num2 + " is \t" + (num1 + num2));

    }
}
