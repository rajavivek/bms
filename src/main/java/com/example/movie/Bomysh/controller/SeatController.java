package com.example.movie.Bomysh.controller;

import com.example.movie.Bomysh.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeatController {
    @Autowired
    SeatService seatService;
}
