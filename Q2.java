// Q2- Write a program to read user input until user writes XDONE and then show the entered text by the user on command line.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        String line;

        while (!(line = sc.nextLine()).equals("XDONE")) {
            input.append(line).append("\n");
        }

        System.out.println("User Input:");
        System.out.println(input.toString());
    }
}
