// Q9- Create a custom exception that do not have any stack trace.

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public Throwable fillInStackTrace() {
        return this;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom error without stack trace");
        } catch (MyException e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }
}
