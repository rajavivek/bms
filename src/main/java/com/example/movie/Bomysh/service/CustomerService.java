package com.example.movie.Bomysh.service;

import com.example.movie.Bomysh.domain.Customer;
import com.example.movie.Bomysh.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){
        return null;
    }

    public Customer updateCustomer(Customer customer){
        return null;
    }

    public Customer deleteCustomer(Customer customer){
        return null;
    }
    public Customer viewCustomer(Integer custId){
        return null;
    }
    public List<Customer> viewAllCustomers(Integer movieId){
        return null;
    }
}
