package org.example;
public class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm; // in years

    // Constructor
    public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    // Getters and Setters
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    // Method to calculate monthly payment
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        double numerator = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfMonths);
        double denominator = Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1;
        return principal * (numerator / denominator);
    }

    // Method to calculate total amount paid over the loan period
    public double calculateTotalPayment() {
        double monthlyPayment = calculateMonthlyPayment();
        int numberOfMonths = loanTerm * 12;
        return monthlyPayment * numberOfMonths;
    }

    @Override
    public String toString() {
        return String.format("Loan Amount: ₹%.2f\nAnnual Interest Rate: %.2f%%\nLoan Term: %d years\n",
                principal, annualInterestRate, loanTerm);
    }
}

