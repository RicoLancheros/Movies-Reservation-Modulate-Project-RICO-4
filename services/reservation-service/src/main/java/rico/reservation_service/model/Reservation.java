package rico.reservation_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    private Long userId;
    private String showtimeId;
    private List<String> seats;    // Ej: ["A1", "A2"....]
    private String status;
}
