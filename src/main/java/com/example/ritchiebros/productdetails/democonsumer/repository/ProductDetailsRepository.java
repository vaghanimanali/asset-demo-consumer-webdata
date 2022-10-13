package com.example.ritchiebros.productdetails.democonsumer.repository;

import com.example.ritchiebros.productdetails.democonsumer.model.OrderEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepository extends JpaRepository<OrderEvents,Long>{
}
