package com.ionolaru.javafinprep.exercises;

public class Ex01_VariablesAndPrinting {
    public static void main(String[] args) {
        String name = "Ion Olaru";
        int age = 33;
        double heightMeters = 1.8;
        System.out.println("Name: " + name + ", Age: " + age + ", Height: " + heightMeters + "m");
        System.out.printf("Name: %s, Age: %d, Height: %.2fm%n", name, age, heightMeters);
    }
}
