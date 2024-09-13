package org.example4;
public class DiscountCalculator {
    private double originalPrice;
    private double discountRate;

    // Constructor
    public DiscountCalculator(double originalPrice, double discountRate) {
        this.originalPrice = originalPrice;
        this.discountRate = discountRate;
    }

    // Getters and Setters
    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // Method to calculate discount amount
    public double calculateDiscountAmount() {
        return originalPrice * (discountRate / 100);
    }

    // Method to calculate final price
    public double calculateFinalPrice() {
        return originalPrice - calculateDiscountAmount();
    }

    @Override
    public String toString() {
        return String.format("Original Price: ₹%.2f\nDiscount Rate: %.2f%%\nDiscount Amount: ₹%.2f\nFinal Price: ₹%.2f\n",
                originalPrice, discountRate, calculateDiscountAmount(), calculateFinalPrice());
    }
}

