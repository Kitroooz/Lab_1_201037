package mk.ukim.finki.lab_1_201037.service.impl;

import mk.ukim.finki.lab_1_201037.model.Movie;
import org.springframework.stereotype.Service;
import mk.ukim.finki.lab_1_201037.repository.MovieRepository;
import mk.ukim.finki.lab_1_201037.service.MovieService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> listAll(){
        return this.movieRepository.findAll();
    }

    @Override
    public List<Movie> searchMovies(String text, Integer rating) {
        return movieRepository.findAll().stream().filter(r->r.getTitle().contains(text) && r.getRating()==rating).collect(Collectors.toList());
    }

    public List<Movie> searchMovies(String text){
        return this.movieRepository.searchMovies(text);
    }
}
