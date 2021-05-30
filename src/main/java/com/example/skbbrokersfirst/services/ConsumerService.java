package com.example.skbbrokersfirst.services;

import com.example.skbbrokersfirst.models.ProcessedInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class ConsumerService {

    @Bean
    public Consumer<ProcessedInfo> receiveProcessed(){
        return cons -> {
            System.out.println(cons.getId());
            System.out.println(cons.getMessage());
            System.out.println(cons.getState());
            System.out.println(cons.getTime());
        };
    }
}
