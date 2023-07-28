package com.ptrenev.orderservice.orderservice.mapstruct;

import com.ptrenev.orderservice.orderservice.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.OrderRequest;

@Mapper(componentModel = "spring", uses = OrderItemsMapper.class)
public interface OrderMapper {
    @Mapping(target = "orderLineItems", source = "orderRequest.orderLineItemsDtoList")
    Order orderDtoToEntity(OrderRequest orderRequest);

    // Additional mapping methods if needed
}