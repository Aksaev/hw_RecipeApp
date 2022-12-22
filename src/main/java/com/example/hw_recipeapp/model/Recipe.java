package com.example.hw_recipeapp.model;

import java.util.LinkedList;
import java.util.Objects;
import java.util.TreeMap;

public class Recipe {
    private String name;
    private int cookingTime;
    private LinkedList<Ingredient> ingredients;
    private TreeMap<Integer, String> steps;

    public Recipe(String name, int cookingTime, LinkedList<Ingredient> ingredients, TreeMap<Integer, String> steps) {
        setName(name);
        setCookingTime(cookingTime);
        setIngredients(ingredients);
        setSteps(steps);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new RuntimeException("Нет названия рецепта!");
        } else {
            this.name = name;
        }
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        if (cookingTime < 0) {
            throw new RuntimeException("Отрицательное значение времени приготовления!");
        } else {
            this.cookingTime = cookingTime;
        }
    }

    public LinkedList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(LinkedList<Ingredient> ingredients) {
        if (ingredients == null) {
            throw new RuntimeException("Ингредиенты отсутствуют!");
        } else {
            this.ingredients = ingredients;
        }
    }

    public TreeMap<Integer, String> getSteps() {
        return steps;
    }

    public void setSteps(TreeMap<Integer, String> steps) {
        if (steps == null) {
            throw new RuntimeException("Инструкция приготовления отсутствует!");
        } else {
            this.steps = steps;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return cookingTime == recipe.cookingTime && Objects.equals(name, recipe.name) && Objects.equals(ingredients, recipe.ingredients) && Objects.equals(steps, recipe.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cookingTime, ingredients, steps);
    }

    @Override
    public String toString() {
        return "Рецепт: " + getName() + "\n" +
                "Время приготовления: " + getCookingTime() + " минут.\n" +
                "Ингридиенты: " + getIngredients() + "\n" +
                "Инструкция приготовления: " + getSteps();
    }
}
