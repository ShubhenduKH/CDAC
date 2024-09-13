package org.example2;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompoundInterestCalculator investment = null;
        boolean running = true;

        while (running) {
            CompoundInterestCalculatorUtil.menuList();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    investment = CompoundInterestCalculatorUtil.acceptRecord();
                    break;
                case 2:
                    if (investment != null) {
                        CompoundInterestCalculatorUtil.printRecord(investment);
                    } else {
                        System.out.println("No investment details available. Please enter investment details first.");
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

