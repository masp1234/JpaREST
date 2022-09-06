package com.example.simplejpawithrest.product.repository;

import com.example.simplejpawithrest.order.model.Order;
import com.example.simplejpawithrest.product.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Order> findById(long id);
}