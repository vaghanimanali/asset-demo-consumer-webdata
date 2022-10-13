package com.example.ritchiebros.productdetails.democonsumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Order_Dish")
public class OrderDish implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Cid;

//    @Column
//    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private OrderEvents orderEvents;

    @Column(name = "dish_id")
    private Long dishId;

    @Column(name = "dish_price")
    private Double dishPrice;


}
