package com.example.DB211125.repository;

import com.example.DB211125.model.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitasRepository extends CrudRepository<Cita, Long> {
}