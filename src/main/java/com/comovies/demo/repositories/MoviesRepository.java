package com.comovies.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comovies.demo.models.MoviesTableModel;

@Repository
public interface MoviesRepository extends CrudRepository<MoviesTableModel, Long> {
    List<MoviesTableModel> findAll();
    Optional<MoviesTableModel> findById(Long id);
    
}
