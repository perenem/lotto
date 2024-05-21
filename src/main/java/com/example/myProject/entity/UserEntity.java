package com.example.myProject.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "password" ,length = 20)
    private String userPassword;

    @Column(length = 10)
    private String userName;
    private String email;
    private String phone;

    @Column(name = "개인저장번호")
    private int saveNum;
}