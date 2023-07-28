package com.ptrenev.orderservice.orderservice.mapstruct;

import com.ptrenev.orderservice.orderservice.model.OrderLineItem;
import org.mapstruct.Mapper;
import org.openapitools.model.OrderLineItemsDto;

@Mapper(componentModel = "spring")
public interface OrderItemsMapper {

    OrderLineItem orderDtoToEntity(OrderLineItemsDto value);
}
