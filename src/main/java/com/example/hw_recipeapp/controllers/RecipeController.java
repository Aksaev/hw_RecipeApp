package com.example.hw_recipeapp.controllers;

import com.example.hw_recipeapp.model.Recipe;
import com.example.hw_recipeapp.service.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    RecipeService recipeService = new RecipeService();

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/get_recipe/{id}")
    public String getRecipe(@PathVariable int id) {
        return recipeService.getRecipe(id);
    }

    @PostMapping("/add_recipe")
    public String addRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

}

