package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford","XX"));
        cars.add(new Car("Infinity","XX"));
        cars.add(new Car("Lexus","XX"));
        model.addAttribute("cars", cars);
        return "/cars";
    }
}
