package com.example.springsecurity.entity.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountRegisterDto {
    private long id;
    private String Username;
    private String password;
    private String confirmPassword;
    private int role;
}