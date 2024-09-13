package org.example5;

public class TollBoothRevenueManager {
	private double carRate;
	private double truckRate;
	private double motorcycleRate;
	private int numberOfCars;
	private int numberOfTrucks;
	private int numberOfMotorcycles;

	// Constructor
	public TollBoothRevenueManager(double carRate, double truckRate, double motorcycleRate, int numberOfCars,
			int numberOfTrucks, int numberOfMotorcycles) {
		this.carRate = carRate;
		this.truckRate = truckRate;
		this.motorcycleRate = motorcycleRate;
		this.numberOfCars = numberOfCars;
		this.numberOfTrucks = numberOfTrucks;
		this.numberOfMotorcycles = numberOfMotorcycles;
	}

	// Getters and Setters
	public double getCarRate() {
		return carRate;
	}

	public void setCarRate(double carRate) {
		this.carRate = carRate;
	}

	public double getTruckRate() {
		return truckRate;
	}

	public void setTruckRate(double truckRate) {
		this.truckRate = truckRate;
	}

	public double getMotorcycleRate() {
		return motorcycleRate;
	}

	public void setMotorcycleRate(double motorcycleRate) {
		this.motorcycleRate = motorcycleRate;
	}

	public int getNumberOfCars() {
		return numberOfCars;
	}

	public void setNumberOfCars(int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}

	public int getNumberOfTrucks() {
		return numberOfTrucks;
	}

	public void setNumberOfTrucks(int numberOfTrucks) {
		this.numberOfTrucks = numberOfTrucks;
	}

	public int getNumberOfMotorcycles() {
		return numberOfMotorcycles;
	}

	public void setNumberOfMotorcycles(int numberOfMotorcycles) {
		this.numberOfMotorcycles = numberOfMotorcycles;
	}

	// Method to calculate total revenue
	public double calculateTotalRevenue() {
		return (carRate * numberOfCars) + (truckRate * numberOfTrucks) + (motorcycleRate * numberOfMotorcycles);
	}

	// Method to calculate total number of vehicles
	public int calculateTotalVehicles() {
		return numberOfCars + numberOfTrucks + numberOfMotorcycles;
	}

	@Override
	public String toString() {
		return String.format(
				"Car Toll Rate: ₹%.2f\nTruck Toll Rate: ₹%.2f\nMotorcycle Toll Rate: ₹%.2f\n"
						+ "Number of Cars: %d\nNumber of Trucks: %d\nNumber of Motorcycles: %d\n"
						+ "Total Vehicles: %d\nTotal Revenue: ₹%.2f\n",
				carRate, truckRate, motorcycleRate, numberOfCars, numberOfTrucks, numberOfMotorcycles,
				calculateTotalVehicles(), calculateTotalRevenue());
	}
}
