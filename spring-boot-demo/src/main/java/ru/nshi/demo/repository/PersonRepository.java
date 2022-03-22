package ru.nshi.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.nshi.demo.model.domain.Person;

import java.util.List;

/**
 * @author rassafel
 */
public interface PersonRepository extends PagingAndSortingRepository<Person, String> {
    List<Person> findAll();

    List<Person> findByAgeIsGreaterThan(Integer age);
}
