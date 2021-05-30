package com.example.skbbrokersfirst.services;

import com.example.skbbrokersfirst.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    @Autowired
    StreamBridge bridge;

    public void publishMessage(Message message){
        bridge.send("toStream-out-0", message);
    }
}
