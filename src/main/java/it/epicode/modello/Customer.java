package it.epicode.modello;

import lombok.Getter;

// id, name, tier (Integer), get tier
public class Customer {
    private Long id;
    private String name;
    @Getter
    private Integer tier;

    public Customer(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }
}