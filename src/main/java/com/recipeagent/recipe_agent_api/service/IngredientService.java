package com.recipeagent.recipe_agent_api.service;

import com.recipeagent.recipe_agent_api.dto.IngredientDTO;
import com.recipeagent.recipe_agent_api.model.Ingredient;
import com.recipeagent.recipe_agent_api.repository.IngredientRepository;
import com.recipeagent.recipe_agent_api.util.IngredientMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {


    private final IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }

    public IngredientDTO getIngredientById(Long ingredientId) {
        Ingredient ingredient = repository.findById(ingredientId).orElse(null);

        IngredientDTO ingredientDTO = IngredientMapper.INSTANCE.toDTO(ingredient);
        return ingredientDTO;
    }

    public List<IngredientDTO> getIngredientByAttr(String name, String ingredientType) {
        return null;
    }

    public List<IngredientDTO> getAllIngredients() {
        return null;
    }
}
