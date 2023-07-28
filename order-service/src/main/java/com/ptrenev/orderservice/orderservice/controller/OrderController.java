package com.ptrenev.orderservice.orderservice.controller;

import com.ptrenev.orderservice.orderservice.mapstruct.OrderMapper;
import com.ptrenev.orderservice.orderservice.model.Order;
import com.ptrenev.orderservice.orderservice.service.OrderService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.model.OrderRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
@Slf4j
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        Order order = orderMapper.orderDtoToEntity(orderRequest);
        orderService.placeOrder(order);
        return "Order placed";
    }
}