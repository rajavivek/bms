package com.example.movie.Bomysh.repository;

import com.example.movie.Bomysh.domain.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre,Integer> {
}
