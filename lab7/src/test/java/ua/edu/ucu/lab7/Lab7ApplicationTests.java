package ua.edu.ucu.lab7;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ua.edu.ucu.lab7.flowers.Flower;
import ua.edu.ucu.lab7.flowers.FlowerColor;
import ua.edu.ucu.lab7.flowers.FlowerType;

@SpringBootTest
class Lab7ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMain() {
		Lab7Application.main(new String[] {});
	}

	@Test
	void testFlower() {
		Flower flower = new Flower(1.0, FlowerColor.BLUE, 1.0, FlowerType.CHAMOMILE);
		assert flower.getPrice() == 1.0;
	}
}
