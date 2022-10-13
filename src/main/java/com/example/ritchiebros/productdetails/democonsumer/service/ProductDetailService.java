package com.example.ritchiebros.productdetails.democonsumer.service;

import com.example.ritchiebros.productdetails.democonsumer.mapper.ProductDetailChildMapper;
import com.example.ritchiebros.productdetails.democonsumer.model.OrderDish;
import com.example.ritchiebros.productdetails.democonsumer.model.OrderEvents;
import com.example.ritchiebros.productdetails.democonsumer.repository.ProductDetailsChildRepository;
import com.example.ritchiebros.productdetails.democonsumer.repository.ProductDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductDetailService {

    @Autowired
    ProductDetailsRepository productDetailsRepository;


    public void save(OrderEvents orderEvents){
        for(OrderDish orderDish : orderEvents.getOrderList()){
            orderDish.setOrderEvents(orderEvents);
        }
        orderEvents.setCustomerName(orderEvents.getCustomerName());
        orderEvents.setDriverId(orderEvents.getDriverId());
        orderEvents.setOrderList(orderEvents.getOrderList());
        productDetailsRepository.save(orderEvents);
    }
}
