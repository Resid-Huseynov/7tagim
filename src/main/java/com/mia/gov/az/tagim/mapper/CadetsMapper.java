package com.mia.gov.az.tagim.mapper;

import com.mia.gov.az.tagim.dto.CadetsDto;
import com.mia.gov.az.tagim.entity.Cadets;

public interface CadetsMapper {

    CadetsDto toDto (Cadets cadets);

    Cadets toEntity (CadetsDto cadetsDto);
}
