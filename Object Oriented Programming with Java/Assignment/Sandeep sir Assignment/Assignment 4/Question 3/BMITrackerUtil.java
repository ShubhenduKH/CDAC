package org.example3;
import java.util.Scanner;

public class BMITrackerUtil {

    // Method to accept weight and height from the user
    public static BMITracker acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();

        return new BMITracker(weight, height);
    }

    // Method to print BMI value and classification
    public static void printRecord(BMITracker bmiTracker) {
        System.out.println(bmiTracker);
    }

    // Method to display the menu
    public static void menuList() {
        System.out.println("1. Enter Weight and Height");
        System.out.println("2. Display BMI Information");
        System.out.println("3. Exit");
    }
}
