package com.tekwill.learning.basics.operators;
import java.util.Scanner;
public class LoanCalculation {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of loan:");
        float loanAmount = scanner.nextFloat();
        System.out.println("Enter the interest rate:");
        float interestRate = scanner.nextFloat();
        System.out.println("Enter the monthly payment:");
        float monthlyPayment = scanner.nextFloat();

        float firstMonthInterest = loanAmount * interestRate / 100 / 12;
        float afterFirstPaymentBalance = loanAmount - monthlyPayment + firstMonthInterest;

        float secondMonthInterest = afterFirstPaymentBalance * interestRate / 100 / 12;
        float afterSecondPaymentBalance = afterFirstPaymentBalance - monthlyPayment + secondMonthInterest;

        float thirdMonthInterest = afterSecondPaymentBalance * interestRate / 100 / 12;
        float afterThirdPaymentBalance = afterSecondPaymentBalance - monthlyPayment + thirdMonthInterest;

        System.out.printf("Balance remaining after first payment: $%.2f\n", afterFirstPaymentBalance);
        System.out.printf("Balance remaining after second payment: $%.2f\n", afterSecondPaymentBalance);
        System.out.printf("Balance remaining after third payment: $%.2f\n", afterThirdPaymentBalance);
    }
}
