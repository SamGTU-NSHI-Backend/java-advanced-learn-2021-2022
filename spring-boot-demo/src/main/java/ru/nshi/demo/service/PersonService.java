package ru.nshi.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.nshi.demo.model.domain.Person;
import ru.nshi.demo.model.dto.CreatePersonDto;

import java.util.List;

/**
 * @author rassafel
 */
public interface PersonService {
    String createPerson(CreatePersonDto dto);

    Page<Person> getPersons(Pageable pageable);

    List<Person> getPersonsGreaterThan(Integer age);
}
