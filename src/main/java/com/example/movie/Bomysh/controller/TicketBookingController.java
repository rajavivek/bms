package com.example.movie.Bomysh.controller;

import com.example.movie.Bomysh.domain.Ticket;
import com.example.movie.Bomysh.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketBookingController {

    @Autowired
    TicketBookingService ticketBookingService;
}
