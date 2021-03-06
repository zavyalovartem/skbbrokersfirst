package com.example.skbbrokersfirst.models;

import lombok.Data;

@Data
public class ProcessedInfo {
    private int id;
    private String state;
    private String time;

    public ProcessedInfo(int id, String state, String time){
        this.id = id;
        this.state = state;
        this.time = time;
    }
}
