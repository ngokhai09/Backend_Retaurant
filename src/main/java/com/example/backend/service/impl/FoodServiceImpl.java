package com.example.backend.service.impl;

import com.example.backend.entity.Food;
import com.example.backend.repository.FoodRepository;
import com.example.backend.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Override
    public Food getFoodById(String id) {
        return foodRepository.getById(id);
    }

    @Override
    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }
}
