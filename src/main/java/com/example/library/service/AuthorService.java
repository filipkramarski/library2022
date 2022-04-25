package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.model.Country;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Author> findAll();
    Optional<Author> save(String name, String surname, Country country);
    Optional<Author> save(Author a);
}
