public class file2 {
    public static void main(String[] args) {
        // Data types in java

        int a = 10;
        float b = 2.32f;
        char c = 'A';
        String name = "Debojyoti Bhattacherjee";
        double anyDigit = 2341.2134;
        boolean statement = true;

        // Box the int to an Integer object
        Class<?> type = ((Object) a).getClass();
        Class<?> type2 = ((Object) b).getClass();
        Class<?> type3 = ((Object) c).getClass();
        Class<?> type4 = ((Object) name).getClass();
        Class<?> type5 = ((Object) anyDigit).getClass();
        Class<?> type6 = ((Object) statement).getClass();

        System.out.println(type.getSimpleName()); // Output: Integer
        System.out.println(type2.getSimpleName());
        System.out.println(type3.getSimpleName());
        System.out.println(type4.getSimpleName());
        System.out.println(type5.getSimpleName());
        System.out.println(type6.getSimpleName());

        // `a` is first converted into an Object using casting:
        // (Object) a
        //
        // Why?
        // Because every class in Java ultimately extends the Object class.
        //
        // Then `.getClass()` is called on that Object.
        // `getClass()` is a method from the Object class that returns
        // the runtime class information of the object.
        //
        // Example:
        // If `a` is actually a String,
        // this returns: class java.lang.String
        //
        // The result is stored inside:
        // Class<?> type
        //
        // `Class<?>` means:
        // "A Class object of some unknown type"
        //
        // `?` is a wildcard meaning:
        // "I don't care what the exact type is right now."
        //
        // So overall:
        // This line gets the actual runtime class/type of object `a`.
    }
}
