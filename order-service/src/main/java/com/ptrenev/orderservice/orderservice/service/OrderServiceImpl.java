package com.ptrenev.orderservice.orderservice.service;

import com.ptrenev.orderservice.orderservice.model.Order;
import com.ptrenev.orderservice.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void placeOrder(Order order) {
        order.setOrderNumber(UUID.randomUUID().toString());
        orderRepository.save(order);
    }
}
