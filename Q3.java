// Q3- Write a java program to show menu and calculate area/circumference using switch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Menu*******\n1. Calculate Area of Circle\n" +
                "2. Calculate Circumference of a Circle\n" +
                "3. Exit.\n" +
                "Choose an option (1-3): ");
        int option = sc.nextInt();
        switch (option) {
            case 1: {
                System.out.println("Enter radius");
                double radius = sc.nextDouble();
                System.out.println(Calculate.circleArea(radius));
                break;
            }
            case 2: {
                System.out.println("Enter radius");
                double radius = sc.nextDouble();
                System.out.println(Calculate.circleCircumference(radius));
                break;
            }
            case 3: {
                System.out.println("Exiting...");
                break;
            }
            default: {
                System.out.println("Please select a valid option");
            }
        }
    }
}

class Calculate {
    static double circleArea(double r) {
        return Math.PI * r * r;
    }

    static double circleCircumference(double r) {
        return 2 * Math.PI * r;
    }
}
