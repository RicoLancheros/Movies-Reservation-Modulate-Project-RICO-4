package rico.showtime_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import rico.showtime_service.model.Showtime;

import java.util.List;

public interface ShowtimeRepository extends MongoRepository<Showtime, String> {
    List<Showtime> findByMovieId(String movieId); // Buscar por película
}
