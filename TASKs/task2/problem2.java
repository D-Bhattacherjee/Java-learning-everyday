/**
 * PROBLEM STATEMENT 2- write a program that finds all of the prime numbers
 * between 2 and 100
 * 
 * [ number N is prime if N is only divisible by 1 and itself ]
 */

public class problem2 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.print(i + "  ");
            }
        }
        System.out.println("\n");
    }
}
