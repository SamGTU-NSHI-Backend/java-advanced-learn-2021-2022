package ru.nshi.demo.config;

import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.nshi.demo.model.domain.Person;
import ru.nshi.demo.model.dto.CreatePersonDto;

/**
 * @author rassafel
 */
@Configuration
public class OrikaConfig {
    @Bean
    MapperFactory mapperFactory() {
        DefaultMapperFactory factory = new DefaultMapperFactory.Builder().build();
        factory.classMap(CreatePersonDto.class, Person.class)
            .field("rawAge", "age")
            .customize(new CustomMapper<CreatePersonDto, Person>() {
                @Override
                public void mapAtoB(CreatePersonDto source, Person target, MappingContext context) {
                    String[] values = source.getFio().split("\\s+");
                    target.setLastName(values[0]);
                    target.setFirstName(values[1]);
                    target.setMiddleName(values[2]);
                }
            })
            .byDefault()
            .register();
        return factory;
    }
}
