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
            case "A" -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            case "S" -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            case "M" -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            default -> System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }



    }
}