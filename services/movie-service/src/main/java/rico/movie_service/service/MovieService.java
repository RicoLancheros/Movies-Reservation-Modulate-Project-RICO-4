package rico.movie_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rico.movie_service.model.Movie;
import rico.movie_service.repository.MovieRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
