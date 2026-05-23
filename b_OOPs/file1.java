// Let's see how we use the car class here
public class file1 {
    public static void main(String[] args) {
        // just construct a new object just like we did with Scanner class
        car myCar = new car();

        // now let put the data in the attributes
        // Object_name.attribute_name = Value;
        // let's continue like this
        myCar.brandName = "B M W";
        myCar.color = "Slate Gray";
        myCar.topSpeed = 315;

        // now we are calling the method [AKA Function]
        // Object_name.method_name()
        // Methods makes a code re-usable
        myCar.carInfo();

        // let's have another object
        car myCar2 = new car();

        myCar2.brandName = "Nissan";
        myCar2.color = "Matt-Carbone-Black";
        myCar2.topSpeed = 295;

        myCar2.carInfo();
    }
}
