package com.example.dinoanimebackend.services;

import com.example.dinoanimebackend.models.Anime;
import com.example.dinoanimebackend.repositories.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    public List<Anime> getAllAnimes() {
        return (List<Anime>) animeRepository.findAll();
    }

    public Anime getAnimeById(int id) {
        return animeRepository.findById(id);
    }
}
