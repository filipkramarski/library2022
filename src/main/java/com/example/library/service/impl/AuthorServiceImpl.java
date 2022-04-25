package com.example.library.service.impl;

import com.example.library.model.Author;
import com.example.library.model.Country;
import com.example.library.repository.AuthorRepository;
import com.example.library.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Optional<Author> save(String name, String surname, Country country) {
        return Optional.of(this.authorRepository.save(new Author(name,surname,country)));
    }

    @Override
    public Optional<Author> save(Author a) {
        return Optional.of(this.authorRepository.save(a));
    }
}
