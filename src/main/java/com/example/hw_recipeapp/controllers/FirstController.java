package com.example.hw_recipeapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/")
    public String appRun() {
        return "Приложение запущено!";
    }

    @GetMapping("/info")
    public String appInfo() {
        return "Имя ученика: Аксаев С.В. " +
                "Название проекта: hw_RecipeApp. " +
                "Дата создания проекта: 11.12.2022. " +
                "Описание проекта: Приложение для сайта рецептов.";
    }
}
