package com.example.skbbrokersfirst.services;

import com.example.skbbrokersfirst.models.ProcessedInfo;
import com.example.skbbrokersfirst.models.ReceivedInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;

@Service
public class ConsumerService {

    private CountDownLatch latch = new CountDownLatch(1);
    private ReceivedInfo received;
    private ProcessedInfo processedInfo;

    @Bean
    public Consumer<ReceivedInfo> receiveProcessed(){
        return cons -> {
            processedInfo = new ProcessedInfo(cons.getId(), cons.getState(), cons.getTime());
            latch.countDown();
        };
    }

    public CountDownLatch getLatch(){
        return latch;
    }

    public ProcessedInfo getProcessedInfo(){
        return processedInfo;
    }
}
