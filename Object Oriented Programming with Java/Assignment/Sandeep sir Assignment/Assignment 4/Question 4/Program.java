package org.example4;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DiscountCalculator discountCalculator = null;
        boolean running = true;

        while (running) {
            DiscountCalculatorUtil.menuList();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    discountCalculator = DiscountCalculatorUtil.acceptRecord();
                    break;
                case 2:
                    if (discountCalculator != null) {
                        DiscountCalculatorUtil.printRecord(discountCalculator);
                    } else {
                        System.out.println("No item details available. Please enter item details first.");
                    }
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

