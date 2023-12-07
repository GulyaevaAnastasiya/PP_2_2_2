package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;


@Controller
public class CarController {

    CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
