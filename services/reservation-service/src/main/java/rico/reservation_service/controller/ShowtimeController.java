package rico.reservation_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class UserController {

    @GetMapping("/")
    public String helloUser() {
        return "¡Hola desde el Reservation Service!";
    }
}