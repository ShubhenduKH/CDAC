package org.example3;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMITracker bmiTracker = null;
        boolean running = true;

        while (running) {
            BMITrackerUtil.menuList();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bmiTracker = BMITrackerUtil.acceptRecord();
                    break;
                case 2:
                    if (bmiTracker != null) {
                        BMITrackerUtil.printRecord(bmiTracker);
                    } else {
                        System.out.println("No BMI data available. Please enter weight and height first.");
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

