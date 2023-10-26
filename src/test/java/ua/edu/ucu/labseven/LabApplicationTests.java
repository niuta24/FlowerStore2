package ua.edu.ucu.labseven;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ua.edu.ucu.labseven.flowers.Flower;
import ua.edu.ucu.labseven.flowers.FlowerColor;
import ua.edu.ucu.labseven.flowers.FlowerType;

@SpringBootTest
class LabApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testMain() {
        LabApplication.main(new String[] {});
    }

    @Test
    void testFlower() {
        Flower flower = new Flower(1.0,
                FlowerColor.BLUE, 1.0, FlowerType.CHAMOMILE);
        assert flower.getPrice() == 1.0;
    }
}
