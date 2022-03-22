package ru.nshi.demo.service;

import ru.nshi.demo.model.domain.Person;
import ru.nshi.demo.model.dto.CreatePersonDto;

import java.util.List;

/**
 * @author rassafel
 */
public interface PersonService {
    String createPerson(CreatePersonDto dto);

    List<Person> getPersons();
}
