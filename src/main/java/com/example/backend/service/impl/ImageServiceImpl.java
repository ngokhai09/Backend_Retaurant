package com.example.backend.service.impl;

import com.example.backend.entity.Image;
import com.example.backend.repository.ImageRepository;
import com.example.backend.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository imageRepository;
    @Override
    public List<Image> findAllByFoodId(String id) {
        return imageRepository.findAllByFoodId(id);
    }
}
