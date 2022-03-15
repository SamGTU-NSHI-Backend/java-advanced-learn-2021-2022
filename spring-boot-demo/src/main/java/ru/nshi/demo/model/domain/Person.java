package ru.nshi.demo.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

/**
 * @author rassafel
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Integer age;
    private LocalDate personBirthDate;
}
