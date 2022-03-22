package ru.nshi.demo.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.nshi.demo.mapper.PersonMapper;
import ru.nshi.demo.model.domain.Person;
import ru.nshi.demo.model.dto.CreatePersonDto;
import ru.nshi.demo.repository.PersonRepository;
import ru.nshi.demo.service.PersonService;

import java.util.List;

/**
 * @author rassafel
 */
@RequiredArgsConstructor
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository repository;
    private final PersonMapper personMapper;

    @Override
    public String createPerson(CreatePersonDto dto) {
        Person person = personMapper.map(dto);
        log.info("Object: {}", person);
        repository.save(person);
        return "Mapped and Created";
    }

    @Override
    public List<Person> getPersons() {
        return repository.findAll();
    }
}
