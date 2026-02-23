package com.ionolaru.javafinprep.exercises;

import java.util.Scanner;

public class Ex02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        double a = sc.nextDouble();
        System.out.print("Operator (+ - * /):");
        String op = sc.next();
        System.out.print("Number 2: ");
        double b = sc.nextDouble();
        boolean valid = true;
        double result = 0;

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                valid = false;
                System.out.println("Cannot divide by zero.");
            } else {
                result = a / b;
            }
        } else {
            valid = false;
            System.out.println("Unknown operator: " + op);
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
