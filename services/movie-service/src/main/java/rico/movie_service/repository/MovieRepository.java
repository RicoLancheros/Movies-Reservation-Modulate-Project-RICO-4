package rico.movie_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rico.movie_service.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}