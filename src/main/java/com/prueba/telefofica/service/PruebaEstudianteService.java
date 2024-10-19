package com.prueba.telefofica.service;

import com.prueba.telefofica.model.dto.PruebaEstudianteDto;
import com.prueba.telefofica.model.request.PruebaEstudianteRequest;
import org.springframework.stereotype.Service;

public interface PruebaEstudianteService {
    PruebaEstudianteDto createPruebaEstudiante(PruebaEstudianteRequest pruebaEstudianteRequest);
    PruebaEstudianteDto getPruebaEstudianteById(Integer eid);
    void updatePruebaEstudiante(PruebaEstudianteRequest pruebaEstudianteRequest);
    void deletePruebaEstudiante(Integer eid);

}
