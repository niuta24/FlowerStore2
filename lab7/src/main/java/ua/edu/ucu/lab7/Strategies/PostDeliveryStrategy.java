package ua.edu.ucu.lab7.Strategies;

public class PostDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Delivered via postal service.");
        // Implement delivery via postal service
    }
}