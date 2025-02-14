package com.example.dinoanimebackend.models;

import org.springframework.data.annotation.Id;

public class Anime {
    @Id
    private Long id;
    private String title;
    private String image_url;
    private String description;
    private int year;
    private String genre;
    private String youtube_url;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }
    public String getImageUrl() {
        return image_url;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getYoutube_url() {
        return youtube_url;
    }
    public void setYoutube_url(String youtube_url) {
        this.youtube_url = youtube_url;
    }
}
