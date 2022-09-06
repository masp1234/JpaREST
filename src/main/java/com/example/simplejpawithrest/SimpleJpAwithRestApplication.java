package com.example.simplejpawithrest;

import com.example.simplejpawithrest.order.model.Order;
import com.example.simplejpawithrest.order.repository.OrderRepository;
import com.example.simplejpawithrest.orderline.model.OrderLine;
import com.example.simplejpawithrest.orderline.repository.OrderLineRepository;
import com.example.simplejpawithrest.product.model.Product;
import com.example.simplejpawithrest.product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SimpleJpAwithRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleJpAwithRestApplication.class, args);

    }


    @Bean
    public CommandLineRunner importData(OrderRepository orderRepository,
                                        OrderLineRepository orderLineRepository,
                                        ProductRepository productRepository) {
        return (args) -> {

            /**
             *  Orders
             */
            final List<Order> orders = new ArrayList<>();
            orders.add(new Order(new Date()));
            orders.add(new Order(new Date()));
            orders.add(new Order(new Date()));
            orderRepository.saveAll(orders);

            /**
             *  Products
             */
            final List<Product> products = new ArrayList<>();
            products.add(new Product("Product 1"));
            products.add(new Product("Product 2"));
            products.add(new Product("Product 3"));
            productRepository.saveAll(products);

            /**
             *  Orderlines
             */
            final List<OrderLine> orderLines = new ArrayList<>();
            orderLines.add(new OrderLine(orders.get(0), products.get(0)));
            orderLines.add(new OrderLine(orders.get(1), products.get(1)));
            orderLines.add(new OrderLine(orders.get(2), products.get(2)));
            orderLineRepository.saveAll(orderLines);

        };

    }
}
