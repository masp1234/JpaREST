package com.example.simplejpawithrest.orderline.repository;

import com.example.simplejpawithrest.orderline.model.OrderLine;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OrderLineRepository extends CrudRepository<OrderLine, Long> {

    Optional<OrderLine> findById(long id);
}