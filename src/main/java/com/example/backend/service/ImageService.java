package com.example.backend.service;

import com.example.backend.entity.Image;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageService {
    List<Image> findAllByFoodId(String id);
}
