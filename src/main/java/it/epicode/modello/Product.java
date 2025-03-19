package it.epicode.modello;

import lombok.Getter;

// atributi Long id, String name, String category, Double price
@Getter
public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;

    public Product(Long id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}