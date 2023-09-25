package com.mia.gov.az.tagim.Repository;

import com.mia.gov.az.tagim.Entity.Cadets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadetsRepository extends JpaRepository<Cadets, Integer> {
}
