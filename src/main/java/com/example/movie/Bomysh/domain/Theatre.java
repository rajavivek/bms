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
@Table(name="theatre")
public class Theatre {
    @Id
    @Column(name="theatre_id") Integer theatreId;
    @Column(name="theatre_name") String TheatreName;
    @Column(name="theatre_city") String TheatreCity;
    @ElementCollection
    List<Movie> listOfMovies;
    @ElementCollection
    List<Screen> listOfScreens;
    @Column(name="mgr_name")  String mgrName;
    @Column(name="mgr_conct_no")  String mgrConctNo;

}
