package ua.edu.ucu.labseven.strategies;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " dollars with PayPal.");
        // Implement PayPal payment logic
    }
}