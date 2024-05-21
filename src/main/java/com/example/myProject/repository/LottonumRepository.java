package com.example.myProject.repository;

import com.example.myProject.entity.LottoNumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LottonumRepository extends JpaRepository<LottoNumEntity, Long> {
}
