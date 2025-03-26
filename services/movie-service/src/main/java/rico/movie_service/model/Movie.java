package rico.movie_service.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String director;
    private String genre;
    private int durationMinutes;
}
