package com.mia.gov.az.tagim.mapper;

import com.mia.gov.az.tagim.dto.CadetsDto;
import com.mia.gov.az.tagim.entity.Cadets;
import org.springframework.stereotype.Component;

@Component
public class CadetsMapperImpl implements CadetsMapper {
    @Override
    public CadetsDto toDto(Cadets cadets) {
        CadetsDto cadetsDto = new CadetsDto();

        cadetsDto.setId(cadets.getId());
        cadetsDto.setAge(cadets.getAge());
        cadetsDto.setName(cadets.getName());
        cadetsDto.setSurname(cadets.getSurname());
        cadetsDto.setFatherName(cadets.getFatherName());

        return cadetsDto;
    }

    @Override
    public Cadets toEntity(CadetsDto cadetsDto) {
        Cadets cadets = new Cadets();

        cadets.setId(cadetsDto.getId());
        cadets.setAge(cadetsDto.getAge());
        cadets.setName(cadetsDto.getName());
        cadets.setSurname(cadetsDto.getSurname());
        cadets.setFatherName(cadetsDto.getFatherName());

        return cadets;
    }
}
