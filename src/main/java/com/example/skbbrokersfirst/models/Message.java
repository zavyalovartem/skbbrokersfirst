package com.example.skbbrokersfirst.models;

import lombok.Data;

@Data
public class Message {
    private Integer id;
    private String name;
    private String phoneNumber;

    public Message(int id, String name, String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
