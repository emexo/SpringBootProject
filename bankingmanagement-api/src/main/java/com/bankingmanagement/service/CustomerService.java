package com.bankingmanagement.service;

import com.bankingmanagement.exception.CustomerNotFoundException;
import com.bankingmanagement.model.CustomerDTO;
import com.bankingmanagement.model.CustomerRequest;

import java.util.List;


public interface CustomerService {

    List<CustomerDTO> findAll() throws CustomerNotFoundException;

    CustomerDTO findCustomerById(int customerId) throws CustomerNotFoundException;

    CustomerDTO saveCustomer(CustomerRequest customerRequest) throws IllegalArgumentException, CustomerNotFoundException;
    CustomerDTO updateCustomer(CustomerRequest customerRequest) throws IllegalArgumentException, CustomerNotFoundException;
}
