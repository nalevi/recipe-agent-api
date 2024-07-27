package com.recipeagent.recipe_agent_api.repository;

import com.recipeagent.recipe_agent_api.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    @Override
    Optional<Ingredient> findById(Long aLong);
}