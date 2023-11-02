package mk.ukim.finki.lab_1_201037.repository;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.lab_1_201037.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MovieRepository {

    List<Movie> movieList = new ArrayList<Movie>(10);

    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++){
            movieList.add(new Movie("Movie"+i, "Summary"+i, i));
        }
    }

    public List<Movie> findAll(){
        return this.movieList;
    }

    public List<Movie> searchMovies(String text){
        return this.movieList.stream().filter(r-> r.getTitle().contains(text)||r.getSummary().contains(text)).collect(Collectors.toList());
    }
}
