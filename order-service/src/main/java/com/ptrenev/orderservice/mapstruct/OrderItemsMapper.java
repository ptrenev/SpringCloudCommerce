package com.ptrenev.orderservice.mapstruct;

import com.ptrenev.orderservice.model.OrderLineItem;
import org.mapstruct.Mapper;
import org.openapitools.model.OrderLineItemsDto;

@Mapper(componentModel = "spring")
public interface OrderItemsMapper {

    OrderLineItem orderDtoToEntity(OrderLineItemsDto value);
}
