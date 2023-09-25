package com.mia.gov.az.tagim.Mapper;

import com.mia.gov.az.tagim.Dto.CadetsDto;
import com.mia.gov.az.tagim.Entity.Cadets;

public interface CadetsMapper {

    CadetsDto toDto (Cadets cadets);

    Cadets toEntity (CadetsDto cadetsDto);
}
