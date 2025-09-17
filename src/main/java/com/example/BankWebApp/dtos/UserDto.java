package com.example.BankWebApp.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private String username;
    private String email;
    private String emailVerify;
    private String password;
    private String passwordVerify;
    private Integer dailyLimit;
}
