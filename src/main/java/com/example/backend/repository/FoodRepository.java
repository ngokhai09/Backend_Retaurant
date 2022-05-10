package com.example.backend.repository;

import com.example.backend.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, String> {
}
