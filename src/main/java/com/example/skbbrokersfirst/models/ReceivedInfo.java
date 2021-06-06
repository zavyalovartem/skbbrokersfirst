package com.example.skbbrokersfirst.models;

import lombok.Data;

@Data
public class ReceivedInfo {
    private int id;
    private String state;
    private String time;
    private String message;

    public ReceivedInfo(int id, String state, String date, String message) {
        this.id = id;
        this.state = state;
        this.time = date;
        this.message = message;
    }
}