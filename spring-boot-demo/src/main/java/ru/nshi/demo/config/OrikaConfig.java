package ru.nshi.demo.config;

import ma.glasnost.orika.DefaultFieldMapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rassafel
 */
@Configuration
public class OrikaConfig {
    @Bean
    MapperFactory mapperFactory() {
        DefaultMapperFactory factory = new DefaultMapperFactory.Builder().build();
        return factory;
    }
}
