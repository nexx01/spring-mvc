package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(Locale locale, ModelMap model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford", "XX"));
        cars.add(new Car("Infinity", "XX"));
        cars.add(new Car("Lexus", "XX"));
        model.addAttribute("cars", cars);
        return "/cars";
    }
}
