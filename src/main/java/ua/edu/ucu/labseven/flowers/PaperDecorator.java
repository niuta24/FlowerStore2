package ua.edu.ucu.labseven.flowers;

public class PaperDecorator extends ItemDecorator {
    private static final double PAPER_PRICE = 20.0;

    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return super.getPrice() + PAPER_PRICE;
    }
}
