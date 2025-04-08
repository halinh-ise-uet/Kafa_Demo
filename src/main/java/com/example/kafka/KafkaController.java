package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/send/a-to-b")
    public String sendAToB(@RequestBody MessageRequest request) {
        kafkaProducer.sendMessage("topic-a-to-b", request.getSender(), request.getContent());
        return "Message sent from A to B: " + request.getContent();
    }

    @PostMapping("/send/b-to-c")
    public String sendBToC(@RequestBody MessageRequest request) {
        kafkaProducer.sendMessage("topic-b-to-c", request.getSender(), request.getContent());
        return "Message sent from B to C: " + request.getContent();
    }

    @PostMapping("/send/c-to-a")
    public String sendCToA(@RequestBody MessageRequest request) {
        kafkaProducer.sendMessage("topic-c-to-a", request.getSender(), request.getContent());
        return "Message sent from C to A: " + request.getContent();
    }
}