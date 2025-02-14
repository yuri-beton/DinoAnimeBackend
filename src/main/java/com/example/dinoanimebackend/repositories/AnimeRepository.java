package com.example.dinoanimebackend.repositories;

import com.example.dinoanimebackend.models.Anime;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends CrudRepository<Anime, Long> {
    Anime findById(long id);
}
