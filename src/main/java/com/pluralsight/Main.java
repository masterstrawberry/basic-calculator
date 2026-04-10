package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option:");

        String answer = scanner.nextLine().toUpperCase();

        switch (answer) {
            case "A" -> add(num1, num2);
            case "S" -> subtract(num1, num2);
            case "M" -> multiply(num1, num2);
            default -> divide(num1, num2);
        }
    }

    public static void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void multiply(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}