package com.ptrenev.orderservice.service;

import com.ptrenev.orderservice.model.Order;
import com.ptrenev.orderservice.repository.OrderRepository;
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
