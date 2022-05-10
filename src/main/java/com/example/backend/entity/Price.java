package com.example.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "\"Price\"")
public class Price {
    @Id
    @Column(name = "priceID", nullable = false, length = 5)
    private String id;

    @Column(name = "priceVal", precision = 19, scale = 4)
    private BigDecimal priceVal;

    @Column(name = "dayBegin")
    private LocalDate dayBegin;

    @Column(name = "dayEnd")
    private LocalDate dayEnd;

    @OneToMany(mappedBy = "priceID")
    private Set<Food> foods = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPriceVal() {
        return priceVal;
    }

    public void setPriceVal(BigDecimal priceVal) {
        this.priceVal = priceVal;
    }

    public LocalDate getDayBegin() {
        return dayBegin;
    }

    public void setDayBegin(LocalDate dayBegin) {
        this.dayBegin = dayBegin;
    }

    public LocalDate getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(LocalDate dayEnd) {
        this.dayEnd = dayEnd;
    }

    public Set<Food> getFoods() {
        return foods;
    }

    public void setFoods(Set<Food> foods) {
        this.foods = foods;
    }

}