package com.example.movie.Bomysh.service;

import com.example.movie.Bomysh.domain.Show;
import com.example.movie.Bomysh.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ShowService {
    @Autowired
    ShowRepository showRepository;

    public Show addShow(Show show){
        return null;
    }

    public Show removeShow(Show show){
        return null;
    }

    public Show updateShow(Show show){
        return null;
    }

    public Show viewShow(Show show){
        return null;
    }

    public List<Show> viewShow(Integer theatreId){
        return null;
    }

    public List<Show> viewShow(LocalDate date){
        return null;
    }

    public List<Show> viewAllShows(){
        return null;
    }

}
