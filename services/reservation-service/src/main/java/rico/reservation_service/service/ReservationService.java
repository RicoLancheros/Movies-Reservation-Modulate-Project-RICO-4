package rico.reservation_service.service;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
//import org.springframework.boot.autoconfigure.security.SecurityProperties; Esta linea no se necesita ya que se creo el DTO
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import rico.reservation_service.client.DTO.UserDTO;
import rico.reservation_service.client.UserClient;
import rico.reservation_service.exception.UserNotFoundException;
import rico.reservation_service.model.Reservation;
import rico.reservation_service.repository.ReservationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final UserClient userClient;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation createReservation(Reservation reservation) {
        try {
            ResponseEntity<UserDTO> response = userClient.getUserById(reservation.getUserId());
            if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
                throw new UserNotFoundException(reservation.getUserId());
            }
            return reservationRepository.save(reservation);
        } catch (FeignException.NotFound ex) {
            throw new UserNotFoundException(reservation.getUserId());
        }
    }

    public List<Reservation> getReservationsByUser(String userId) {
        return reservationRepository.findByUserId(userId);
    }
}