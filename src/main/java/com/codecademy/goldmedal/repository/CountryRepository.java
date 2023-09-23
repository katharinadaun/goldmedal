package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Optional<Country> findByName(String name);
    List<Country> findByOrderByNameAsc();
    List<Country> findByOrderByNameDesc();
    List<Country> findByOrderByGdpAsc();
    List<Country> findByOrderByGdpDesc();
    List<Country> findByOrderByPopulationAsc();
    List<Country> findByOrderByPopulationDesc();
}
