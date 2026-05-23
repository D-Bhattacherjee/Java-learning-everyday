import java.util.Scanner;

public class file4 {
    // Conditional Statement
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age to proceed :\t");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Not eligible for PAN card application");
        } else {
            System.out.println("Get Ready for your Pan card");
        }
    }
}
