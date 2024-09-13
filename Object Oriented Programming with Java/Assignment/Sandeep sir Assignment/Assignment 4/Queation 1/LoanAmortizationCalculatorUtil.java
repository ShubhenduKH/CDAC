package org.example;
import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {

    // Method to accept loan details from the user
    public static LoanAmortizationCalculator acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (loan amount) in ₹: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term (in years): ");
        int loanTerm = scanner.nextInt();

        return new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
    }

    // Method to print loan details and calculations
    public static void printRecord(LoanAmortizationCalculator loan) {
        System.out.println(loan);
        System.out.printf("Monthly Payment: ₹%.2f\n", loan.calculateMonthlyPayment());
        System.out.printf("Total Amount Paid: ₹%.2f\n", loan.calculateTotalPayment());
    }

    // Method to display the menu
    public static void menuList() {
        System.out.println("1. Enter Loan Details");
        System.out.println("2. Display Loan Details");
        System.out.println("3. Exit");
    }
}

