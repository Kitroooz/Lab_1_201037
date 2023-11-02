package mk.ukim.finki.lab_1_201037.service;

import mk.ukim.finki.lab_1_201037.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> listAll();
    List<Movie> searchMovies(String text, Integer rating);

}
