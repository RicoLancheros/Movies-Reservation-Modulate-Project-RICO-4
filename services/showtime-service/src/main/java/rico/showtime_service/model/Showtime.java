package rico.showtime_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "showtimes")
public class Showtime {
    @Id
    private String id;
    private String movieId;       // Relación con Movie
    private String theaterId;     // ID de sala (puede ser String o ObjectId)
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean available;
}