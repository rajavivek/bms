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
@Table(name="screen")
public class Screen {
    @Id
    @Column(name="screen_id")
    Integer screenId;
    @Column(name="thetre_id")
    Integer thetreId;
    @Column(name="screen_name")
    String screenName;
    @ElementCollection
    List<Show> listOfShows;
    @Column(name="rows")
    Integer rows;
    @Column(name="cols")
    Integer cols;
}
