package com.comovies.demo.services;

import java.util.Optional;
import org.springframework.stereotype.Service;
import java.util.List;

import com.comovies.demo.repositories.MoviesRepository;
import com.comovies.demo.models.MoviesTableModel;

@Service
public class MoviesService {
    private MoviesRepository moviesRepository;
    public MoviesService(MoviesRepository initialMoviesRepository) {
        this.moviesRepository = initialMoviesRepository;
    }

    public List<MoviesTableModel> getAllMovies() {
        return moviesRepository.findAll();
    }
    public Void addMovie(MoviesTableModel movie) {
        moviesRepository.save(movie);
        return null;
    }

    public MoviesTableModel getMovieById(Long id){
        Optional<MoviesTableModel> aMovie = moviesRepository.findById(id);
        if(aMovie.isPresent()){
            return aMovie.get();
        }
        return null;
    }

    public Void updateMovie(MoviesTableModel movie) {
        Optional<MoviesTableModel> existingMovie = moviesRepository.findById(movie.getMovieId());
        if (existingMovie.isPresent()) {
            moviesRepository.save(movie);
        } else {
            // Gérer le cas où le film n'existe pas
            throw new IllegalArgumentException("Movie not found with id: " + movie.getMovieId());
        }
        return null;
    }

    public void deleteByID(Long id) {
        moviesRepository.deleteById(id);
    }
}
