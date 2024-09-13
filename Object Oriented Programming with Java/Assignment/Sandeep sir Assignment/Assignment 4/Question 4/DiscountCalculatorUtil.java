package org.example4;
import java.util.Scanner;

public class DiscountCalculatorUtil {

    // Method to accept original price and discount rate from the user
    public static DiscountCalculator acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price of the item in ₹: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountRate = scanner.nextDouble();

        return new DiscountCalculator(originalPrice, discountRate);
    }

    // Method to print discount amount and final price
    public static void printRecord(DiscountCalculator discountCalculator) {
        System.out.println(discountCalculator);
    }

    // Method to display the menu
    public static void menuList() {
        System.out.println("1. Enter Item Details");
        System.out.println("2. Display Discount and Final Price");
        System.out.println("3. Exit");
    }
}

