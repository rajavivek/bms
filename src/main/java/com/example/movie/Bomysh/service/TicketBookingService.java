package com.example.movie.Bomysh.service;

import com.example.movie.Bomysh.domain.TicketBooking;
import com.example.movie.Bomysh.repository.TicketBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TicketBookingService {
    @Autowired
    TicketBookingRepository ticketBookingRepository;

    public TicketBooking addBooking(TicketBooking ticketBooking){
        return null;
    }
    public TicketBooking updateBooking(TicketBooking ticketBooking){
        return null;
    }
    public TicketBooking cancelBooking(TicketBooking ticketBooking){
        return null;
    }
    public List<TicketBooking> showAllBooking(Integer movieId){
        return null;
    }
    public List<TicketBooking> showAllBooking(LocalDate date){
        return null;
    }
    public List<TicketBooking> showBookingList(Integer showId){
        return null;
    }
    public Double calculateTotalcost(Integer bookingId){
        return null;
    }
}
