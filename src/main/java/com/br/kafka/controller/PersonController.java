package com.br.kafka.controller;

import com.br.kafka.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {


    @GetMapping("/send")
    public ResponseEntity find(@RequestBody Person person){
        return ResponseEntity.ok().build();
    }
}
