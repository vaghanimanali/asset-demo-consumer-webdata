package com.example.ritchiebros.productdetails.democonsumer.mapper;

import com.example.model.OrderEvents;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductDetailMapper {

    ProductDetailMapper INSTANCE = Mappers.getMapper(ProductDetailMapper.class);


    OrderEvents toDTO(com.example.ritchiebros.productdetails.democonsumer.model.OrderEvents orderEventsEntity);

    com.example.ritchiebros.productdetails.democonsumer.model.OrderEvents toEntity(OrderEvents orderEvents);
}
