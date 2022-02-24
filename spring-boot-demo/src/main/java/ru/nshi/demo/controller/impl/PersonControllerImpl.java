package ru.nshi.demo.controller.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.nshi.demo.controller.PersonController;
import ru.nshi.demo.model.domain.Person;
import ru.nshi.demo.model.dto.CreatePersonDto;
import ru.nshi.demo.service.PersonService;

/**
 * @author rassafel
 */
@RequiredArgsConstructor
@Slf4j
@RestController
public class PersonControllerImpl implements PersonController {
    private final PersonService service;

    @Override
    public ResponseEntity<String> createPerson(CreatePersonDto dto) {
        log.info("Received object: {}", dto);
        String person = service.createPerson(dto);
        return ResponseEntity.ok(person);
    }

    @Override
    public ResponseEntity<Person> findById(String id, String firstName) {
        if (id.matches("\\d+")) {
            Person person = new Person(id, firstName, "SecondName", "MiddleName", 123);
            return ResponseEntity.ok(person);
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
