package com.example.kafka;

public class MessageRequest {
    private String sender;
    private String content;

    // Constructor mặc định
    public MessageRequest() {
    }

    public MessageRequest(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

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
}