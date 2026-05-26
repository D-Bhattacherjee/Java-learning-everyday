/**
 * PROBLEM STATEMENT 6- Print a conversion table of Inch to meters. Output a
 * blank line in every 5 lines. Display output upto 12 feets
 * 
 * [1 inch is equal to 0.0254 meters]
 */

public class problem6 {

    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            double meters = i * 0.0254;
            System.out.printf(i + " inch is equal to " + String.format("%.3f", meters) + "meters\n");
            if (i % 5 == 0) {
                System.out.println("\n");
            }
        }
    }
}
