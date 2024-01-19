package com.example.securitymasterdemo.dao;

import com.example.securitymasterdemo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer,Integer> {
}
