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
@Table(name="show")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="show_id")
    Integer showId;
    @Column(name="start_time")
    LocalDate startTime;
    @Column(name="end_time")
    LocalDate endTime;
    @Column(name="show_name")
    String showName;
//    @Column(name="start_time")
@OneToOne
@JoinColumn(name = "movie_movie_id")
Movie movie;
    @Column(name="screen_id") Integer screenId;
    @Column(name="theatre_id") Integer theatreId;
}
