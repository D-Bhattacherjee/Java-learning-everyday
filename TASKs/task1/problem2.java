import java.util.Scanner;

/**
 * PROBLEM STATEMENT 2- extendTake user input for variable gallons and convert
 * it to litres; give the user Option to input by choice; Gallons/Litres
 * 
 * output the conversion - X Gallons = Y Litres
 * 
 * [1 gallon = 3.7854 litres]
 */

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("\nEnter number of gallons to convert:\t");
        // double gallon = sc.nextDouble();
        System.out.println("\nWhat conversion do you need?\n\t1. Gallon to Litres\t2. Litres to Gallon");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("===  Gallons to Litres  ===");
                System.out.print("Enter amount of Gallons to convervet:\t");
                double gallon = sc.nextDouble();
                double litres = gallon * 3.7854;
                System.out.println("= = = [ 1 gallon = 3.7854 litres ] = = =");
                System.out.println(gallon + " Gallons\t=\t " + String.format("%.2f Litres", litres));
                break;
            case 2:
                System.out.println("===  Litres to Gallons  ===");
                System.out.print("Enter amount of Litres to convervet:\t");
                double Litres = sc.nextDouble();
                double gallons = Litres / 3.7854;
                System.out.println("= = = [ 1 gallon = 3.7854 litres ] = = =");
                System.out.println(Litres + " Litres\t=\t" + String.format("%.2f Gallons", gallons));
            default:
                break;
        }
        sc.close();

    }
}
