package ua.edu.ucu.lab7.Strategies;

public class DHLDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Delivered via DHL.");
        // Implement delivery via DHL
    }
}