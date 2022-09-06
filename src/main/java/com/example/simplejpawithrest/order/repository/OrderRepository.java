package com.example.simplejpawithrest.order.repository;

import com.example.simplejpawithrest.order.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OrderRepository extends CrudRepository<Order, Long> {

    Optional<Order> findById(long id);
}