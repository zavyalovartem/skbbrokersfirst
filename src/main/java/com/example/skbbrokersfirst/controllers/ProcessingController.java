package com.example.skbbrokersfirst.controllers;

import com.example.skbbrokersfirst.models.Info;
import com.example.skbbrokersfirst.models.Message;
import com.example.skbbrokersfirst.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ProcessingController {

    @Autowired
    PublisherService publisherService;

    @PostMapping("/info")
    public void infoController(@RequestBody Info info){
        var rand = new Random();
        var id = rand.nextInt();
        var message = new Message(id, info.getName(), info.getPhoneNumber());
        publisherService.publishMessage(message);
    }
}
