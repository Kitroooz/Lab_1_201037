package mk.ukim.finki.lab_1_201037.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    String title;
    String summary;
    double rating;
}
