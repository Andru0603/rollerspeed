package com.rollerspeed.rollerspeed.repository;

import com.rollerspeed.rollerspeed.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    // JpaRepository ya provee: findAll(), save(), findById(), deleteById()
}