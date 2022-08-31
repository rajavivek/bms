package com.example.movie.Bomysh.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="seat")
public class Seat {
    @Id
    @Column(name="seat_id")
    Integer seatId;
    @Column(name="row")
    Integer row;
    @Column(name="col")
    Integer col;
    @Column(name="type")
    String type;
    @Column(name="price")
    Double price;

}
