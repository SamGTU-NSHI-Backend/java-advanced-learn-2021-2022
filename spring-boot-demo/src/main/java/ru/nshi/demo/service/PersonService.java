package ru.nshi.demo.service;

import ru.nshi.demo.model.dto.CreatePersonDto;

/**
 * @author rassafel
 */
public interface PersonService {
    String createPerson(CreatePersonDto dto);
}
