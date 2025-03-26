package rico.reservation_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rico.reservation_service.model.Reservation;
import rico.reservation_service.service.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    //Listar todas las reservas
    @GetMapping("/")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    //Crear reserva
    @PostMapping("/")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    //Buscar por usuario
    @GetMapping("/user/{userId}")
    public List<Reservation> getReservationsByUser(@PathVariable String userId) {
        return reservationService.getReservationsByUser(userId);
    }
}