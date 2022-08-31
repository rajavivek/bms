package com.example.movie.Bomysh.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name= "ticket_booking")
public class TicketBooking {
    @Id
    @Column(name="ticket_id")
    Integer ticketId;
    @Column(name="theatre_name") Integer showId;
    @Column(name="booking_date") LocalDate bookingDate;
    @Column(name="transaction_id") Integer transactionId;
    @Column(name="transaction_mode")  String transactionMode;
    @Column(name="transaction_status")  String transactionStatus;
    @Column(name="total_cost")  Double totalCost;
//    @Column(name="ticket_id")
    @OneToOne
    Ticket ticket;



}
