package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;

        while (start) {
            System.out.println("===== Scientific Calculator =====");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("Enter a number: ");
                        try {
                            double number = sc.nextDouble();
                            System.out.println("Square root: " + squareRoot(number));
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input.");
                            sc.next();
                        }
                        break;

                    case 2:
                        System.out.print("Enter a non-negative integer: ");
                        try {
                            int number = sc.nextInt();
                            System.out.println("Factorial: " + (number < 0 ? "Cannot calculate" : factorial(number)));
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input.");
                            sc.next();
                        }
                        break;

                    case 3:
                        System.out.print("Enter a positive number: ");
                        try {
                            double number = sc.nextDouble();
                            System.out.println("Natural log: " + naturalLogarithm(number));
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input.");
                            sc.next();
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Enter base: ");
                            double base = sc.nextDouble();
                            System.out.print("Enter exponent: ");
                            double exponent = sc.nextDouble();
                            System.out.println("Result: " + power(base, exponent));
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input.");
                            sc.next();
                        }
                        break;

                    case 5:
                        start = false;
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                sc.next();
            }
            System.out.println();
        }
        sc.close();
    }

    public static double squareRoot(double number) {
        if (number < 0) throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        return Math.sqrt(number);
    }

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static double naturalLogarithm(double number) {
        if (number <= 0) throw new IllegalArgumentException("Cannot calculate logarithm of a non-positive number");
        return Math.log(number);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
