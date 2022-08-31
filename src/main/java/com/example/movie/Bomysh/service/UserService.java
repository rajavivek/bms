package com.example.movie.Bomysh.service;

import com.example.movie.Bomysh.domain.User;
import com.example.movie.Bomysh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User addNewUser(User user){
        return null;
    }

    public User signIn(User user){
        return null;
    }

    public User signOut(User user){
        return null;
    }


}
