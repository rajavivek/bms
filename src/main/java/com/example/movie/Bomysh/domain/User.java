package com.example.movie.Bomysh.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="user_id")
    Integer userId;
    @Column(name="password")
    String password;
    @Column(name="role")
    String role;
}
