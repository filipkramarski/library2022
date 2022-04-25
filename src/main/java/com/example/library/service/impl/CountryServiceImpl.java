package com.example.library.service.impl;

import com.example.library.model.Country;
import com.example.library.repository.CountryRepository;
import com.example.library.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Optional<Country> save(String surname, String continent) {
        return Optional.of(this.countryRepository.save(new Country(surname,continent)));
    }

    @Override
    public Optional<Country> save(Country c) {
        return Optional.of(this.countryRepository.save(c));
    }

    @Override
    public List<Country> findAll() {
        return this.countryRepository.findAll();
    }
}
