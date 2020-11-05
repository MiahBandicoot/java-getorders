package com.lambdaschool.javaorders.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public class CustomerController {
    @DeleteMapping
    @PatchMapping
    @PutMapping
    @PostMapping(value = "/customer", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addCustomer{@Valid @RequestBody Customer newCustomer
    }
}
