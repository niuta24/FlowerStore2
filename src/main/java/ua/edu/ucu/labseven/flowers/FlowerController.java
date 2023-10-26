package ua.edu.ucu.labseven.flowers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FlowerController {
    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(new Flower(1.0, FlowerColor.BLUE,
                1.0, FlowerType.CHAMOMILE));
    }
}
