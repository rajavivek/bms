package com.example.movie.Bomysh.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    Integer movieId;
    @Column(name="movie_name")
    String movieName;
    @Column(name="movie_genre")
    String movieGenre;
    @Column(name="movie_hrs")
    String movieHrs;
    @Column(name="language")
    String language;
    @Column(name="description")
    String description;
//@Embeddable
    
    @Basic
    @OneToOne(mappedBy = "movie")
    Show show;

}
