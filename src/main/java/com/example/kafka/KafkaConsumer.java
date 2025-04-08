package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic-a-to-b", groupId = "group-id")
    public void listenFromA(Message message) {
        System.out.println("B received from A: " + message);
    }

    @KafkaListener(topics = "topic-b-to-c", groupId = "group-id")
    public void listenFromB(Message message) {
        System.out.println("C received from B: " + message);
    }

    @KafkaListener(topics = "topic-c-to-a", groupId = "group-id")
    public void listenFromC(Message message) {
        System.out.println("A received from C: " + message);
    }
}