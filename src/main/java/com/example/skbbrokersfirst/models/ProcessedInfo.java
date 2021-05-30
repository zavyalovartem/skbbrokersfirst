package com.example.skbbrokersfirst.models;

import lombok.Data;

@Data
public class ProcessedInfo {
    private int id;
    private String state;
    private String time;
    private String message;

    public ProcessedInfo(int id, String state, String date, String message) {
        this.id = id;
        this.state = state;
        this.time = date;
        this.message = message;
    }
}