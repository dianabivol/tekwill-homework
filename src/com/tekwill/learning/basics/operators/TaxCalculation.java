package com.tekwill.learning.basics.operators;

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount:");
        float amount = scanner.nextFloat();
        System.out.printf("Amount with 5%% tax: $%.2f", amount * 1.05);
    }
}
