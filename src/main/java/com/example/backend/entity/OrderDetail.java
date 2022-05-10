package com.example.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "\"OrderDetail\"")
public class OrderDetail {
    @EmbeddedId
    private OrderDetailId id;

    @MapsId("orderID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "orderID", nullable = false)
    private Order orderID;

    @MapsId("foodId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "foodId", nullable = false)
    private Food food;

    @Column(name = "number")
    private Integer number;

    public OrderDetailId getId() {
        return id;
    }

    public void setId(OrderDetailId id) {
        this.id = id;
    }

    public Order getOrderID() {
        return orderID;
    }

    public void setOrderID(Order orderID) {
        this.orderID = orderID;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}