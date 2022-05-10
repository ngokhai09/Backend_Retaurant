package com.example.backend.service;

import com.example.backend.entity.Price;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PriceService {
    List<Price> getAllPriceByFoodId(String id);
    Price getPriceActiceByFoodId(String id);
}
