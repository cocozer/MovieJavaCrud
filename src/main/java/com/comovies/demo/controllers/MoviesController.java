package com.comovies.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.comovies.demo.models.MoviesTableModel;
import com.comovies.demo.repositories.MoviesRepository;
import com.comovies.demo.services.MoviesService;

@Controller
public class MoviesController {
    private MoviesService moviesService;
    public MoviesController(MoviesService initialMoviesService) {
        this.moviesService = initialMoviesService;
    }

    @GetMapping("/movieswelcome")
    public String showMoviesWelcome() {
        System.out.println("Movies Welcome");
        return "index";
    }

    @GetMapping("/movies")
    public String showMovies(Model model) {
        List<MoviesTableModel> listOfMovies = moviesService.getAllMovies();
        model.addAttribute("listOfMovies", listOfMovies);
        System.out.println("Movies");
        return "movies";
    }

    @GetMapping("/addmoviepage")
    public String showAddMoviePage(@ModelAttribute("movie") MoviesTableModel movie) {
        System.out.println("Add Movie Page");
        return "addmovie";
    }

    @PostMapping("/addmovieaction")
    public String addAMovie(@Valid @ModelAttribute("movie") MoviesTableModel newMovie, BindingResult result) {
        if(result.hasErrors()){
            System.out.println("Submit error");
            System.out.println(result);
            return "addmovie";
        }
        moviesService.addMovie(newMovie);
        System.out.println("Submit completed");
        return "redirect:/movies";
    }

    @GetMapping("/movie/{id}")
    public String viewMovieById(@PathVariable("id") Long id, Model model){
        MoviesTableModel aMovie = moviesService.getMovieById(id);
        model.addAttribute("aSingleMovie", aMovie);
        System.out.println(aMovie);
        return "movie";
    }

    @PostMapping("/edit/{id}")
    public String editMovie(@PathVariable("id") Long id, @Valid @ModelAttribute("aSingleMovie") MoviesTableModel updateCurentMovie, BindingResult result){
        System.out.println("ID ============ "+ id);
        if(result.hasErrors()){
            System.out.println("Edit submit error");
            System.out.println(result);
            return "movie";
        }
        moviesService.updateMovie(updateCurentMovie);
        System.out.println("Edit submit completed");
        return "redirect:/movies";
    }

    @PostMapping("/remove/{id}")
    public String removeMovie(@PathVariable("id") Long id){
        moviesService.deleteByID(id);
        System.out.println("Movie removed");
        return "redirect:/movies";
    }
}
