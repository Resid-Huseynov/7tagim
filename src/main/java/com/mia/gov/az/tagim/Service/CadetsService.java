package com.mia.gov.az.tagim.Service;

import com.mia.gov.az.tagim.Dto.CadetsDto;

import java.util.List;

public interface CadetsService {

    List<CadetsDto> findAll();

    CadetsDto findById(int theId);

    CadetsDto save(CadetsDto cadetsDto);

    CadetsDto update(int theId, CadetsDto cadetsDto);

    void deleteById(int theId);
}
