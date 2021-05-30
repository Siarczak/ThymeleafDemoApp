package pl.szymanowski.thymeleafdemoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

@GetMapping("/car")
public String get(Model model)
{
    Car car1 = new Car("Romero","Alfa");
    Car car2 = new Car("Volkswagen","Golf");
    Car car3 = new Car("Skoda","Octavian");
    Car car4 = new Car("BMW","3");

    List<Car> cars = Arrays.asList(car1,car2,car3,car4);

    model.addAttribute("cars",cars);

    return "car";
}



}


