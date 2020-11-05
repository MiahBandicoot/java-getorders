package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class OrdersController {
    @Autowired
    OrderService ordersService;
    @GetMapping(value = "/order/{ordernum}",produces = "{application/json}")
    public ResponseEntity<?> getOrderByNumber(@PathVariable long ordernum){
        Order o = ordersService.findOrderById(ordernum);
        return new ResponseEntity<>(o, HttpStatus.OK);
    }
    @GetMapping(value = "/orders/order/{id}", produces = "{application/json}")
    public ResponseEntity<?> getOrdersById(@PathVariable long ordnum){
    Order o = ordersService.findOrderbyOrderId(ordnum);
    return new ResponseEntity<>(o, HttpStatus.OK);
    }

}
