package rico.showtime_service.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rico.showtime_service.model.Showtime;
import rico.showtime_service.service.ShowtimeService;

import java.util.List;

@RestController
@RequestMapping("/showtime")
@RequiredArgsConstructor
public class ShowtimeController {
    private final ShowtimeService showtimeService;

    @GetMapping("/")
    public List<Showtime> getAllShowtimes() {
        return showtimeService.getAllShowtimes();
    }

    @PostMapping("/")
    public Showtime createShowtime(@RequestBody Showtime showtime) {
        return showtimeService.createShowtime(showtime);
    }

    @GetMapping("/movie/{movieId}")
    public List<Showtime> getShowtimesByMovie(@PathVariable String movieId) {
        return showtimeService.getShowtimesByMovieId(movieId);
    }
}






