package com.comovies.demo.models;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class MoviesTableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @Size(min = 1, max = 200, message="Movie Title must be between 1 and 200 characters")
    private String movieTitle;
    @Size(min = 1, max = 200, message="Movie Genre must be between 1 and 200 characters")
    private String movieGenre;
    @Size(min = 1, max = 200, message="Movie Director must be between 1 and 200 characters")
    private String movieDirector;
    @Size(min = 1, max = 500, message="Movie Description must be between 1 and 200 characters")
    private String movieDescription;
    @Max(value = 10, message="Movie Rating must be between 1 and 10")
    private int movieRating;
    private Date movieReleaseDate;
    private Time movieDuration;
    private String moviePoster;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt; 

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date(System.currentTimeMillis());
    }


    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date(System.currentTimeMillis());
    }
    

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public Date getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(Date movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public Time getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(Time movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
