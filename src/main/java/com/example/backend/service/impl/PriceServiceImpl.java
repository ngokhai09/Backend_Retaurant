package com.example.backend.service.impl;

import com.example.backend.entity.Price;
import com.example.backend.repository.PriceRepository;
import com.example.backend.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceRepository priceRepository;
    @Override
    public List<Price> getAllPriceByFoodId(String id) {
        return priceRepository.findAllByFoodsId(id);
    }

    @Override
    public Price getPriceActiceByFoodId(String id) {
        return null;
    }
}
