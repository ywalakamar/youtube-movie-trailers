package com.tuts.movies.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuts.movies.models.Movie;
import com.tuts.movies.repository.MovieRepository;

@Service
public class MovieService {
    @Autowired
    MovieRepository repository;

    public List<Movie> getAll() {
        return repository.findAll();
    }

    public Optional<Movie> getOne(String id) {
        return repository.findMovieByImdbId(id);
    }
}
