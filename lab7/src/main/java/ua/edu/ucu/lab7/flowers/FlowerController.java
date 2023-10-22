package ua.edu.ucu.lab7.flowers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower(1.0, FlowerColor.BLUE, 1.0, FlowerType.CHAMOMILE));
    }
}
