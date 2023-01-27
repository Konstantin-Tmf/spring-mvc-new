package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.sevice.CarService;


@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String listsCar(@RequestParam(value = "count", defaultValue = "5") int numberCars,
                           Model model) {

        model.addAttribute("list", carService.filterCar(numberCars));
        return "cars";

    }
}
