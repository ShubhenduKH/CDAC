package org.example2;
import java.util.Scanner;

public class CompoundInterestCalculatorUtil {

    // Method to accept investment details from the user
    public static CompoundInterestCalculator acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount in ₹: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of times the interest is compounded per year: ");
        int numberOfCompounds = scanner.nextInt();

        System.out.print("Enter the investment duration (in years): ");
        int years = scanner.nextInt();

        return new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
    }

    // Method to print investment details and calculations
    public static void printRecord(CompoundInterestCalculator investment) {
        System.out.println(investment);
        System.out.printf("Future Value: ₹%.2f\n", investment.calculateFutureValue());
        System.out.printf("Total Interest Earned: ₹%.2f\n", investment.calculateTotalInterest());
    }

    // Method to display the menu
    public static void menuList() {
        System.out.println("1. Enter Investment Details");
        System.out.println("2. Display Investment Details");
        System.out.println("3. Exit");
    }
}

