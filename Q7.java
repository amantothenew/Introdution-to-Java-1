// Q7- WAP showing try, multi-catch and finally blocks

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Ans" + result);
        }
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("An exception occurred: " + e);
        }
        finally {
            System.out.println("This will always execute");
        }

        System.out.println("End.");
    }
}
