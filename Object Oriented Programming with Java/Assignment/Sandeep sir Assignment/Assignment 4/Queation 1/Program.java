package org.example;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanAmortizationCalculator loan = null;
        boolean running = true;

        while (running) {
            LoanAmortizationCalculatorUtil.menuList();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loan = LoanAmortizationCalculatorUtil.acceptRecord();
                    break;
                case 2:
                    if (loan != null) {
                        LoanAmortizationCalculatorUtil.printRecord(loan);
                    } else {
                        System.out.println("No loan details available. Please enter loan details first.");
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

