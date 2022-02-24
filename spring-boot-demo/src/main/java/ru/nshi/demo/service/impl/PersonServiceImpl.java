package ru.nshi.demo.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Service;
import ru.nshi.demo.model.domain.Person;
import ru.nshi.demo.model.dto.CreatePersonDto;
import ru.nshi.demo.service.PersonService;

/**
 * @author rassafel
 */
@RequiredArgsConstructor
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {
    private final MapperFactory mapperFactory;

    @Override
    public String createPerson(CreatePersonDto dto) {
        BoundMapperFacade<CreatePersonDto, Person> facade = mapperFactory.getMapperFacade(CreatePersonDto.class, Person.class);
        Person person = facade.map(dto);
        log.info("Object: {}", person);
        return "Mapped and Created";
    }
}
