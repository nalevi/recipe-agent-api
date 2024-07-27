package com.recipeagent.recipe_agent_api.service;

import com.recipeagent.recipe_agent_api.dto.IngredientDTO;
import com.recipeagent.recipe_agent_api.model.IngredientType;
import com.recipeagent.recipe_agent_api.repository.IngredientRepository;
import com.recipeagent.recipe_agent_api.model.Ingredient;
import com.recipeagent.recipe_agent_api.util.IngredientMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IngredientServiceTest {

    @Mock
    private IngredientRepository repository;

    @InjectMocks
    private IngredientService ingredientService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        ingredientService = new IngredientService(repository);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetIngredientByIdSuccessful() {
        // Given
        Long ingredientId = 1L;
        Ingredient ingredient = new Ingredient();
        ingredient.setId(ingredientId);
        ingredient.setName("Test Ingredient");
        ingredient.setType(IngredientType.BAKERY);

        when(repository.findById(ingredientId)).thenReturn(Optional.of(ingredient));

        // When
        IngredientDTO result = ingredientService.getIngredientById(ingredientId);

        // Then
        assertNotNull(result);
        assertEquals(ingredientId, result.getId());
        assertEquals("Test Ingredient", result.getName());

        verify(repository, times(1)).findById(ingredientId);
    }

    @Test
    void testGetIngredientByIdNotFound() {

    }

    @Test
    void getIngredientByAttr() {
    }

    @Test
    void getAllIngredients() {
    }
}