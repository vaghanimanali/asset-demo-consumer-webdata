package com.example.ritchiebros.productdetails.democonsumer.repository;

import com.example.ritchiebros.productdetails.democonsumer.model.OrderDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsChildRepository extends JpaRepository<OrderDish,Long> {
}
