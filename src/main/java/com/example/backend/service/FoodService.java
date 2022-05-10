package com.example.backend.service;

import com.example.backend.entity.Food;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FoodService {
    Food getFoodById(String id);
    List<Food> getAllFood();
}
