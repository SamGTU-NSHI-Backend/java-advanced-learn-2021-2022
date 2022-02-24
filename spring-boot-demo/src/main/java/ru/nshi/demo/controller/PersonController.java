package ru.nshi.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nshi.demo.model.dto.CreatePersonDto;

/**
 * @author rassafel
 */
@RequestMapping(PersonController.MAPPING)
public interface PersonController {
    String MAPPING = "/persons";

    @PostMapping("/create")
    ResponseEntity<String> createPerson(@RequestBody(required = false) CreatePersonDto dto);

    @GetMapping("/{id}")
    ResponseEntity<String> findById(@PathVariable(required = false) String id,
                                    @RequestParam(defaultValue = "FirstName") String firstName);
}
