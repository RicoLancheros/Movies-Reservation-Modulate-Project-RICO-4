package rico.reservation_service.model;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    private String userId;         // Relación con User
    private String showtimeId;     // Relación con Showtime
    private List<String> seats;    // Ej: ["A1", "A2"]
    private String status;         // "CONFIRMED", "CANCELLED"
}
