package com.recipeagent.recipe_agent_api.util;

import com.recipeagent.recipe_agent_api.dto.IngredientDTO;
import com.recipeagent.recipe_agent_api.model.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IngredientMapper {
    IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);

    IngredientDTO toDTO(Ingredient entity);

    Ingredient toEntity(IngredientDTO dto);
}
