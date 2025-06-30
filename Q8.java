// Q8- WAP to produce NoClassDefFoundError and ClassNotFoundException

// For NoClassDefFoundError
// Step 1: Create Helper.java with some class definition and compile it
// Step 2: Delete Helper.class
// Step 3: Run Test.java which tries to use Helper

public class Test {
    public static void main(String[] args) {
        Helper h = new Helper(); 
        h.display();
    }
}

class Helper {
    void display() {
        System.out.println("Hello from Helper");
    }
}

public class ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.some.MissingClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}
