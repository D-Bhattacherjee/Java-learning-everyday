// in this file let's see how methods can be used
public class file2 {
    public static int multipicationTable(int num) {
        int result = 0;
        System.out.println("-----------------Multiplication Table of : " + num + " -----------------");
        for (int i = 1; i <= 10; i++) {
            result = i * num;
            System.out.println(num + " X " + i + " = " + result);
        }
        return result;
    }

    public static void main(String[] args) {
        // we can use above code to get the multiplication table of any number we want
        // such as 1, 2, 5, 34, 67

        // **caution: Type of input must be INTEGER, anything else will throw an error
        multipicationTable(2);
        multipicationTable(3);
        multipicationTable(250);
    }
}
