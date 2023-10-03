package com.mia.gov.az.tagim.repository;

import com.mia.gov.az.tagim.entity.Cadets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadetsRepository extends JpaRepository<Cadets, Integer> {
}
