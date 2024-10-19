package com.prueba.telefofica.repository;

import com.prueba.telefofica.model.entity.PruebaEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruebaEstudianteRepository extends JpaRepository<PruebaEstudiante,Integer> {
}
