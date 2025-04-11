package com.jpa.bookmanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
@EntityListeners(value = MyEntityListener.class)
public class Book implements Auditable{

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
