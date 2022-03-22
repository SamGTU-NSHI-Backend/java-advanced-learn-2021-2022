package ru.nshi.demo.mapper.converter;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author rassafel
 */
public class StringToLocalDateConverter extends CustomConverter<String, LocalDate> {
    public static final String CONVERTER_CODE = "StringToLocalDateConverter";

    @Override
    public LocalDate convert(String s, Type<? extends LocalDate> type) {
        return LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}
