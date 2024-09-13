package org.example5;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TollBoothRevenueManager manager = null;
        boolean running = true;

        while (running) {
            TollBoothRevenueManagerUtil.menuList();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager = TollBoothRevenueManagerUtil.acceptRecord();
                    break;
                case 2:
                    if (manager != null) {
                        TollBoothRevenueManagerUtil.printRecord(manager);
                    } else {
                        System.out.println("No toll booth details available. Please enter details first.");
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

