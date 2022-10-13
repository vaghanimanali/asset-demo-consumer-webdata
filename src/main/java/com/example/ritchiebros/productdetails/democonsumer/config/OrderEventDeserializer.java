package com.example.ritchiebros.productdetails.democonsumer.config;


import com.example.model.OrderEvents;


public class OrderEventDeserializer extends AvroDeserializer<OrderEvents> {

    public OrderEventDeserializer() {
        super(OrderEvents.class);
    }

}


