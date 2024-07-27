package com.recipeagent.recipe_agent_api.dto;

import com.recipeagent.recipe_agent_api.model.IngredientType;



public class IngredientDTO {
    private int id;
    private String name;
    private IngredientType type;

    public IngredientDTO(int id, String name, IngredientType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
