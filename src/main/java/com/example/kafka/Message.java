package com.example.kafka;

import java.time.LocalDateTime;

public class Message {
    private String sender;
    private String content;
    private LocalDateTime timestamp;

    // Constructor mặc định (yêu cầu cho JSON deserialization)
    public Message() {
    }

    public Message(String sender, String content, LocalDateTime timestamp) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters và Setters
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{sender='" + sender + "', content='" + content + "', timestamp=" + timestamp + "}";
    }
}