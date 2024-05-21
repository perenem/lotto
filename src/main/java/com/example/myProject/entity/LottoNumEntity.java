package com.example.myProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LottoNumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private int no1;
    private int no2;
    private int no3;
    private int no4;
    private int no5;
    private int no6;
    private int bonus;
}
