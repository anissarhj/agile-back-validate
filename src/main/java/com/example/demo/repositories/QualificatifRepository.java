package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Qualificatif;

public interface QualificatifRepository extends JpaRepository<Qualificatif, Integer> {
    @Query("select qf from Qualificatif qf where qf.minimal = :minimal")
    Qualificatif findByMinmal(@Param("minimal") String minimal);


}
