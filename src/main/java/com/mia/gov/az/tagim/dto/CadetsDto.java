package com.mia.gov.az.tagim.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CadetsDto {

    private int id;

    private String name;

    private String surname;

    private String fatherName;

    private int age;
}
