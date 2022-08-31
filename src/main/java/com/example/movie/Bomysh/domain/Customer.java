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
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer customerId;
    @Column(name="customerName")
    String customerName;
    @Column(name="address")
    String address;
    @Column(name="mobile_no")
    String mobileNo;
    @Column(name="email")
    String email;
    @Column(name="password")
    String password;
}
