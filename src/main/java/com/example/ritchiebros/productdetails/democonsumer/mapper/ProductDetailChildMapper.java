package com.example.ritchiebros.productdetails.democonsumer.mapper;


import com.example.ritchiebros.productdetails.democonsumer.model.OrderDish;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductDetailChildMapper {

    ProductDetailChildMapper INSTANCE = Mappers.getMapper(ProductDetailChildMapper.class);


    @Mapping(target = "dishId", source="dishId")
    @Mapping(target = "dishPrice",source="dishPrice")
    OrderDish toEntity(com.example.model.OrderDish orderChildEntity);

    com.example.model.OrderDish toDTO(OrderDish orderDish);

}
