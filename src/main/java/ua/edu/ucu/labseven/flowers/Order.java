package ua.edu.ucu.labseven.flowers;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.labseven.strategies.DeliveryStrategy;
import ua.edu.ucu.labseven.strategies.Payment;
import ua.edu.ucu.labseven.filters.SearchFilter;

public class Order {

    private List<Item> items; // Made this private for encapsulation
    private Payment paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    // Adding a constructor to initialize the items list
    public Order() {
        items = new ArrayList<>();
    }

    public void setPaymentStrategy(Payment payment) {
        this.paymentStrategy = payment;
    }

    public void setDeliveryStrategy(DeliveryStrategy delivery) {
        this.deliveryStrategy = delivery;
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
