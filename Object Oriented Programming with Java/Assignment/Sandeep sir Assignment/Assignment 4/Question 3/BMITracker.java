package org.example3;
public class BMITracker {
    private double weight; // weight in kilograms
    private double height; // height in meters

    // Constructor
    public BMITracker(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Getters and Setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return weight / (height * height);
    }

    // Method to classify BMI
    public String classifyBMI() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    @Override
    public String toString() {
        double bmi = calculateBMI();
        return String.format("BMI: %.2f\nClassification: %s\n", bmi, classifyBMI());
    }
}
