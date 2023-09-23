package com.codecademy.goldmedal.repositories;
import com.codecademy.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;

public class CountryRepository extends CrudRepository<Country, Long> {
}
