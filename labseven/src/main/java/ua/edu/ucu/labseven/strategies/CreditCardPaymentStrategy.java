package ua.edu.ucu.labseven.strategies;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " dollars with Credit Card.");
        // Implement credit card payment logic
    }
}