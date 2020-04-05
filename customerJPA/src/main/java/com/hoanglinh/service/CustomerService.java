package com.hoanglinh.service;

import com.hoanglinh.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Object findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
