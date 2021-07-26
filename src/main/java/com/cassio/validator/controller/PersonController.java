package com.cassio.validator.controller;

import com.cassio.validator.dto.PersonRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {

    @PostMapping("/v1/person")
    public ResponseEntity<Object> create(@RequestBody @Valid PersonRequestDTO personRequest) {
        return ResponseEntity.ok(personRequest);
    }
}
