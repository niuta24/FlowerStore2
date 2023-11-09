package ua.edu.ucu.labseven.flowers;

public class DiscountDecorator extends ItemDecorator {
    private static final double DISCOUNT_PERCENTAGE = 0.8;

    public DiscountDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return super.getPrice() * DISCOUNT_PERCENTAGE;
    }
}
