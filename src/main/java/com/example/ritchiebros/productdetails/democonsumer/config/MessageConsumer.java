package com.example.ritchiebros.productdetails.democonsumer.config;


import com.example.model.OrderDish;
import com.example.model.OrderEvents;
import com.example.ritchiebros.productdetails.democonsumer.mapper.ProductDetailChildMapper;
import com.example.ritchiebros.productdetails.democonsumer.mapper.ProductDetailMapper;


import com.example.ritchiebros.productdetails.democonsumer.repository.ProductDetailsChildRepository;
import com.example.ritchiebros.productdetails.democonsumer.service.ProductDetailService;
import com.example.ritchiebros.productdetails.democonsumer.service.ProductDetailsChildService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;

@Slf4j
public class MessageConsumer {

    @Autowired
    ProductDetailService productDetailService;

    @Autowired
    ProductDetailsChildService productDetailsChildService;

    @KafkaListener(
            containerFactory = "kafkaListenerContainerFactory",
            topics = "${kafka.topic.name}",
            id = "listener",
            groupId = "${kafka.topic.consumer-group}")
    public void listener(OrderEvents orderEvents) {
        System.out.println("received info ");
        System.out.println("Received User information : " + orderEvents.toString());
        try {
            com.example.ritchiebros.productdetails.democonsumer.model.OrderEvents orderEvents1 = ProductDetailMapper.INSTANCE.toEntity(orderEvents);
            productDetailService.save(orderEvents1);
            log.info("save to database");

        } catch (Exception e) {
            e.printStackTrace();

        }

//
//    @KafkaListener(containerFactory = "kafkaListenerContainerFactory",
//            topics = "${kafka.topic.name}",
//            id = "listener",
//            groupId = "${kafka.topic.consumer-group}")
//    public void listener(Acknowledgment acknowledgment, ConsumerRecord<Long, OrderEvents> record) {
//        log.info(
//                "Processing Message Key = {},  Value= {} ",
//                record.key(),
//                record.value().getOrderList());
//        acknowledgment.acknowledge();
//    }
    }
}
