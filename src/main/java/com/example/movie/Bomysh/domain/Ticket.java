package com.example.movie.Bomysh.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="ticket")
public class Ticket {
    @Id@Column(name="ticket_id")
    Integer ticketId;
    @Column(name="theatre_name") Integer noOfString;
    @ElementCollection
    List<Seat> seatnumbers;
//    @Column(name="booking_reference")
    @OneToOne(mappedBy="ticket")
    TicketBooking bookingReference;
    @Column(name="ticket_status") Boolean ticketStatus;
}
