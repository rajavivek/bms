package com.example.movie.Bomysh.service;

import com.example.movie.Bomysh.domain.Movie;
import com.example.movie.Bomysh.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public Movie addMovie(Movie movie){
        return null;
    }
    public Movie updateMovie(Movie movie){
        return null;
    }
    public Movie deleteMovie(Movie movie){
        return null;
    }
    public Movie viewMovie(Integer movieId){
        return null;
    }
    public List<Movie> viewAllMovieList(){
        return null;
    }

    public List<Movie> viewMovieList(Integer theatreId){
        return null;
    }
    public List<Movie> viewMovieList(LocalDate date){
        return null;
    }

}
