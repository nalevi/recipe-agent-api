package com.recipeagent.recipe_agent_api.controller;

import com.recipeagent.recipe_agent_api.model.Ingredient;
import com.recipeagent.recipe_agent_api.service.IngredientService;
import com.recipeagent.recipe_agent_api.dto.IngredientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class IngredientController {

    @Autowired
    private IngredientService service;

    @GetMapping(produces = "application/json")
    public ResponseEntity getIngredients(@RequestParam(required = false) Long ingredientId,
                                         @RequestParam(required = false) String name,
                                         @RequestParam(required = false) String ingredientType) {
        List<IngredientDTO> ingredients;
        try {
            if (ingredientId != null) {
                var ingredientDTO = service.getIngredientById(ingredientId);
                ingredients = List.of(ingredientDTO);
            } else if (name != null || ingredientType != null) {
                ingredients = service.getIngredientByAttr(name, ingredientType);
            } else {
                ingredients = service.getAllIngredients();
            }

            return ResponseEntity.ok(ingredients);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
