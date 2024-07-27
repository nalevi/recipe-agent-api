package com.recipeagent.recipe_agent_api.model;


import jakarta.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private IngredientType type;

    public Ingredient(Long id, String name, IngredientType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Ingredient() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.type = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IngredientType getType() {
        return type;
    }

    public void setType(IngredientType type) {
        this.type = type;
    }
}