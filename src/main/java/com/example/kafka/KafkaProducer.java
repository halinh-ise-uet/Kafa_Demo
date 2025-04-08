package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(String topic, String sender, String content) {
        Message message = new Message(sender, content, LocalDateTime.now());
        kafkaTemplate.send(topic, message);
        System.out.println("Sent message: " + message + " to " + topic);
    }
}