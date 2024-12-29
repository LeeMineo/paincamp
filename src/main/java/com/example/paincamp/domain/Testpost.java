package com.example.paincamp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Testpost {
    @Id
    Long id;

    String title;
    String content;
    String author;
}