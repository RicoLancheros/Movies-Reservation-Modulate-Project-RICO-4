package rico.showtime_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rico.showtime_service.model.Showtime;
import rico.showtime_service.repository.ShowtimeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowtimeService {
    private final ShowtimeRepository showtimeRepository;

    public List<Showtime> getAllShowtimes() {
        return showtimeRepository.findAll();
    }

    public Showtime createShowtime(Showtime showtime) {
        return showtimeRepository.save(showtime);
    }

    public List<Showtime> getShowtimesByMovieId(String movieId) {
        return showtimeRepository.findByMovieId(movieId);
    }
}