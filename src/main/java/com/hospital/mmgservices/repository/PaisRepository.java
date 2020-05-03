package com.hospital.mmgservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.mmgservices.domain.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {

	
}
