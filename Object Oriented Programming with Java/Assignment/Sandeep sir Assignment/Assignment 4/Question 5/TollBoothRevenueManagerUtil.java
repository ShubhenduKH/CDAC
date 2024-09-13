package org.example5;
import java.util.Scanner;

public class TollBoothRevenueManagerUtil {

    // Method to accept toll rates and vehicle counts from the user
    public static TollBoothRevenueManager acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the toll rate for Cars (₹): ");
        double carRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Trucks (₹): ");
        double truckRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Motorcycles (₹): ");
        double motorcycleRate = scanner.nextDouble();

        System.out.print("Enter the number of Cars: ");
        int numberOfCars = scanner.nextInt();

        System.out.print("Enter the number of Trucks: ");
        int numberOfTrucks = scanner.nextInt();

        System.out.print("Enter the number of Motorcycles: ");
        int numberOfMotorcycles = scanner.nextInt();

        return new TollBoothRevenueManager(carRate, truckRate, motorcycleRate, numberOfCars, numberOfTrucks, numberOfMotorcycles);
    }

    // Method to print the toll booth details
    public static void printRecord(TollBoothRevenueManager manager) {
        System.out.println(manager);
    }

    // Method to display the menu
    public static void menuList() {
        System.out.println("1. Enter Toll Rates and Vehicle Counts");
        System.out.println("2. Display Toll Booth Information");
        System.out.println("3. Exit");
    }
}

