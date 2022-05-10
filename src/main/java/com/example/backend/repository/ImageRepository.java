package com.example.backend.repository;

import com.example.backend.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, String> {
    @Query(value = "select * from Image inner join Food on Image.imageId = Food.imageID where foodID = :id",nativeQuery = true)
    List<Image> findAllByFoodId(String id);
}
