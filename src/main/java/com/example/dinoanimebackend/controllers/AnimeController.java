package com.example.dinoanimebackend.controllers;

import com.example.dinoanimebackend.models.Anime;
import com.example.dinoanimebackend.services.AnimeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anime")
@CrossOrigin(origins = "http://localhost:3000")  // Разрешаем запросы с фронтенда

public class AnimeController {
    private final AnimeService animeService;
    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/all")
    public List<Anime> home() {
        return animeService.getAllAnimes();
    }

    @GetMapping("/{id}")
    public Anime getAnimeById(@PathVariable int id) {
        return animeService.getAnimeById(id);
    }
}
