package com.example.ritchiebros.productdetails.democonsumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="orderEvents")
public class OrderEvents implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @Column(name= "equip_id", nullable= true)
    private Long Equip_ID;

    @Column(name="customerName")
    private String customerName;

    @Column(name= "driverId")
    private Long driverId;

    @OneToMany(mappedBy = "orderEvents", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "Order_Dish",
//            joinColumns = @JoinColumn(name = "customerId"))
    private List<OrderDish> orderList;
}
