package com.example.backend.api;

import com.example.backend.entity.Food;
import com.example.backend.entity.Price;
import com.example.backend.service.FoodService;
import com.example.backend.service.ImageService;
import com.example.backend.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @Autowired
    private PriceService priceService;
//    @Autowired
//    private ImageService imageService;


    @GetMapping
    public ResponseEntity<List<Food>> getAllProducts() {
        List<Food> products = foodService.getAllFood();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFoodById(@PathVariable String id){
        Food food = foodService.getFoodById(id);
        return ResponseEntity.ok().body(food);
    }
}
