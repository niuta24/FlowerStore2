package ua.edu.ucu.lab7.Strategies;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " dollars with PayPal.");
        // Implement PayPal payment logic
    }
}