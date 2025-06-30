// Q1- Write a class with FirstName, LastName & age field. 
// Print Firstname, LastName & age using static block, static method & static variable respectively.

public class Main {
    static String firstName;
    static String lastName;
    static int age;

    static {
        firstName = "Aman";
        System.out.println("First Name (from static block): " + firstName);
    }

    static void printLastName() {
        lastName = "Pal";
        System.out.println("Last Name (from static method): " + lastName);
    }

    public static void main(String[] args) {
        age = 22;
        printLastName();
        System.out.println("Age (from static variable): " + age);
    }
}
