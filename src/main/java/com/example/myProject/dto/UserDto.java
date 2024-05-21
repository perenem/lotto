package com.example.myProject.dto;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long userId;
    private String userPassword;
    private String userName;
    private String email;
    private String phone;
    private int saveNum;

}
