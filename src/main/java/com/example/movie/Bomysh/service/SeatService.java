package com.example.movie.Bomysh.service;

import com.example.movie.Bomysh.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    SeatRepository seatRepository;
}
