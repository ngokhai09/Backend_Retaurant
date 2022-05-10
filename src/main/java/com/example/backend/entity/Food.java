package com.example.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "\"Food\"")
public class Food {
    @Id
    @Column(name = "foodID", nullable = false, length = 5)
    private String id;

    @Column(name = "foodName", length = 50)
    private String foodName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "priceID")
    private Price priceID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "imageID")
    private Image imageID;

    @Column(name = "isActive")
    private Boolean isActive;

    @Column(name = "createTime")
    private LocalDate createTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryID")
    private Category categoryID;

    @OneToMany(mappedBy = "food")
    private Set<OrderDetail> orderDetails = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Price getPriceID() {
        return priceID;
    }

    public void setPriceID(Price priceID) {
        this.priceID = priceID;
    }

    public Image getImageID() {
        return imageID;
    }

    public void setImageID(Image imageID) {
        this.imageID = imageID;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public Category getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Category categoryID) {
        this.categoryID = categoryID;
    }

    public Set<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

}