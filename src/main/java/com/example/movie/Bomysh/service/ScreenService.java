package com.example.movie.Bomysh.service;

import com.example.movie.Bomysh.repository.ScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreenService {
    @Autowired
    ScreenRepository screenRepository;
}
