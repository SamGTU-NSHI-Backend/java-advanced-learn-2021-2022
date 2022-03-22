package ru.nshi.demo.repository;

import org.springframework.data.repository.CrudRepository;
import ru.nshi.demo.model.domain.Person;

import java.util.List;

/**
 * @author rassafel
 */
public interface PersonRepository extends CrudRepository<Person, String> {
    List<Person> findAll();
}
