package com.example.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class OrderDetailId implements Serializable {
    private static final long serialVersionUID = -8370447392856613436L;
    @Column(name = "orderID", nullable = false, length = 5)
    private String orderID;

    @Column(name = "foodId", nullable = false, length = 5)
    private String foodId;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrderDetailId entity = (OrderDetailId) o;
        return Objects.equals(this.orderID, entity.orderID) &&
                Objects.equals(this.foodId, entity.foodId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, foodId);
    }

}