package com.example.movie.Bomysh.service;

import com.example.movie.Bomysh.domain.Seat;
import com.example.movie.Bomysh.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    SeatRepository seatRepository;

    public Seat bookSeat(Seat seat){
        return  null;
    }
    public Seat cancelSeatBooking(Seat seat){
        return null;
    }
    public Seat blockSeat(Seat seat){
        return null;
    }
}
