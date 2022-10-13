package com.example.ritchiebros.productdetails.democonsumer.service;

import com.example.ritchiebros.productdetails.democonsumer.model.OrderDish;
import com.example.ritchiebros.productdetails.democonsumer.repository.ProductDetailsChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsChildService {

    @Autowired
    ProductDetailsChildRepository productDetailsChildRepository;

    public void saveChild(OrderDish orderDish){
       productDetailsChildRepository.save(orderDish);

    }
}
