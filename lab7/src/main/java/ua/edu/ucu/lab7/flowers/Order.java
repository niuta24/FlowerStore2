package ua.edu.ucu.lab7.flowers;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.lab7.Strategies.DeliveryStrategy;
import ua.edu.ucu.lab7.Strategies.Payment;
import ua.edu.ucu.lab7.filters.SearchFilter;

public class Order {

    private List<Item> items; // Made this private for encapsulation
    private Payment paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void processOrder(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("No payment strategy selected.");
        }

        if (deliveryStrategy != null) {
            deliveryStrategy.deliver();
        } else {
            System.out.println("No delivery strategy selected.");
        }
    }

    // Adding a constructor to initialize the items list
    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    // Note: Renamed the parameter to avoid hiding the field
    public List<Item> search(SearchFilter searchFilter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (searchFilter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}
