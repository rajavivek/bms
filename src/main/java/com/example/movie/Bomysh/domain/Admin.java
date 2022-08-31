package com.example.movie.Bomysh.domain;

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
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer adminId;
    @Column(name="admin_name")
    String adminName;
    @Column(name="admin_contact")
    String adminContact;
}
