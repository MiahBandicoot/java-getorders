package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public class CustomerController {
    @Autowired
    private CustomersService customersService;
    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomers(){
        List<Customer> myCustomers = customersService.findAllCustomers();
        return new ResponseEntity<>(myCustomers, HttpStatus.OK);
    }
    @GetMapping(value = "/customer/{custid}",produces = {"application/json"})
    public ResponseEntity<?> getCustomerById(@PathVariable long custid){
        Customer c = customersService.findCustomersById(custid);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    @GetMapping(value = "/namelike/{custname}", produces = {"application/json"})
    public ResponseEntity<?> findCustomerByName(@PathVariable String custname){
        List<Customer> myCustomerList = customersService.findByBCustomerName(custname);
        return new ResponseEntity<>(myCustomerList, HttpStatus.OK);
    }
    @DeleteMapping
    @PatchMapping
    @PutMapping
    @PostMapping(value = "/customer", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addCustomer{@Valid @RequestBody Customer newCustomer
    }
}
