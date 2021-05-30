package com.example.skbbrokersfirst.models;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Info {
    @NotBlank
    private String name;
    @NotBlank
    private String login;
    @Size(min=5, message="Минимальная длина пароля - 5 символов")
    private String password;
    @Size(min = 11, max = 11, message = "Неверное количество цифр в номере")
    private String phoneNumber;
}
