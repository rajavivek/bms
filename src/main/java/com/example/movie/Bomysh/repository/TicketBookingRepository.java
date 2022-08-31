package com.example.movie.Bomysh.repository;

import com.example.movie.Bomysh.domain.TicketBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Integer> {
}
