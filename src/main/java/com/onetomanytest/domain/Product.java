package com.onetomanytest.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_products")
    private Category category;

    public Product(String name, int quantity, double price){
        this.name = name;
        this.quantity=quantity;
        this.price=price;
    }
}
