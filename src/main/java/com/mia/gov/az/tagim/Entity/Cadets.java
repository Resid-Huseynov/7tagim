package com.mia.gov.az.tagim.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cadets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cadets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    private String fatherName;

    private int age;
}
