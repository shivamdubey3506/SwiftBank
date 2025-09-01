package com.bank.service.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.service.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    
}