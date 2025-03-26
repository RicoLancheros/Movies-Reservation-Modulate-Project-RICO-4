package rico.showtime_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/showtime")
public class UserController {

    @GetMapping("/")
    public String helloUser() {
        return "¡Hola desde el Showtime Service!";
    }
}