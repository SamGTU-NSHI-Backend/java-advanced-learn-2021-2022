package ru.nshi.demo.config;

import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.nshi.demo.mapper.converter.StringToLocalDateConverter;
import ru.nshi.demo.model.domain.Person;
import ru.nshi.demo.model.dto.CreatePersonDto;

/**
 * @author rassafel
 */
@Configuration
public class OrikaConfig {
    @Bean
    public MapperFactory mapperFactory() {
        MapperFactory factory = new DefaultMapperFactory.Builder().build();

        ConverterFactory converterFactory = factory.getConverterFactory();
        converterFactory.registerConverter(StringToLocalDateConverter.CONVERTER_CODE,
            new StringToLocalDateConverter());

        return factory;
    }
}
