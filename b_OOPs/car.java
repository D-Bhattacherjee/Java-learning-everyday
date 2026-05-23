// car is a class
public class car {
    // these 3 are attributes of the classes
    int topSpeed;
    String brandName;
    String color;

    // It is a method which decides what to do with those data we got from
    // attributes
    void carInfo() {
        System.out.println("-------------------------------");
        System.out.println("Brand :\t" + brandName);
        System.out.println("Color :\t" + color);
        System.out.println("Top Speed :\t" + topSpeed + "Km/Hr");
        System.out.println("-------------------------------");
    }
}
// Here is a fun fact

// a class does not have to be declared in a same file it works in
// we can have a different file and declare our class there