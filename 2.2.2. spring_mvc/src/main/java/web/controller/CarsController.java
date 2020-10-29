package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.cervice.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model
            , @RequestParam(value = "count", defaultValue = "5") int sumCars) {

        List<Car> messages = new ArrayList<>();
        messages.add(new Car("carOne", 1, 1));
        messages.add(new Car("carTwo", 2, 2));
        messages.add(new Car("carTree", 3, 3));
        messages.add(new Car("carFour", 4, 4));
        messages.add(new Car("carFive", 5, 5));

        messages = CarService.getCarsFromListOnNumber(messages, sumCars);
        model.addAttribute("messages", messages);

        return "index";
    }

}