package com.mia.gov.az.tagim.service;

import com.mia.gov.az.tagim.dto.CadetsDto;
import com.mia.gov.az.tagim.entity.Cadets;
import com.mia.gov.az.tagim.exception.CadetNotFoundError;
import com.mia.gov.az.tagim.mapper.CadetsMapper;
import com.mia.gov.az.tagim.repository.CadetsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CadetsServiceImpl implements CadetsService {

    private final CadetsMapper cadetsMapper;

    private final CadetsRepository cadetsRepository;

    @Override
    public List<CadetsDto> findAll() {
        return cadetsRepository.findAll().stream().map(cadetsMapper::toDto).toList();
    }

    @Override
    public CadetsDto findById(int theId) {
        return cadetsMapper.toDto(cadetsRepository.findById(theId).
                orElseThrow(() -> new CadetNotFoundError(theId)));
    }

    @Override
    public CadetsDto save(CadetsDto cadetsDto) {
        return cadetsMapper.toDto(cadetsRepository.save(cadetsMapper.toEntity(cadetsDto)));
    }

    @Override
    public CadetsDto update(int theId, CadetsDto cadetsDto) {

        Cadets temp = cadetsRepository.findById(theId).
                orElseThrow(() -> new CadetNotFoundError(theId));

        temp.setName(cadetsDto.getName());
        temp.setSurname(cadetsDto.getSurname());
        temp.setFatherName(cadetsDto.getFatherName());
        temp.setAge(cadetsDto.getAge());

        return cadetsMapper.toDto(cadetsRepository.save(temp));
    }

    @Override
    public void deleteById(int theId) {

        Cadets temp = cadetsRepository.findById(theId).orElseThrow(() -> new CadetNotFoundError(theId));

        cadetsRepository.deleteById(theId);
    }
}
