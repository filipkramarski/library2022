package com.example.library.service;

import com.example.library.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    Optional<Country> save(String name, String continent);
    Optional<Country> save(Country c);
    List<Country> findAll();

}
