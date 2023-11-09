package ua.edu.ucu.labseven.flowers;

public class ItemDecorator extends Item {
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice() {
        return item.getPrice();
    }
}
