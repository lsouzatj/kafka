package com.br.kafka.model;

import lombok.Data;

@Data
public class Person {
    private String name;
    private Long idade;
    private String cpf;
}
