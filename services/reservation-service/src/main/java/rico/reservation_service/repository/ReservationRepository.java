package rico.reservation_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import rico.reservation_service.model.Reservation;

import java.util.List;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
    List<Reservation> findByUserId(String userId);
}
