package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("BMV", "X5", 2));
        cars.add(new Car("Mazda", "CX-5", 3));
        cars.add(new Car("Ford", "Focus", 1));
        cars.add(new Car("Mini", "Cooper", 4));
        cars.add(new Car("Mitsubishi", "Lancer", 9));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
