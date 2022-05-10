package com.example.backend.repository;

import com.example.backend.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceRepository extends JpaRepository<Price, String> {
    List<Price> findAllByFoodsId(String id);
}
