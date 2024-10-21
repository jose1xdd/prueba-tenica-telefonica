package com.prueba.telefofica.service;

import com.prueba.telefofica.exception.PruebaEstudianteException;
import com.prueba.telefofica.model.dto.PruebaEstudianteDto;
import com.prueba.telefofica.model.request.PruebaEstudianteRequest;

public interface PruebaEstudianteService {
    PruebaEstudianteDto createPruebaEstudiante(PruebaEstudianteRequest pruebaEstudianteRequest);

    PruebaEstudianteDto getPruebaEstudianteById(Integer eid) throws PruebaEstudianteException;

    PruebaEstudianteDto updatePruebaEstudiante(Integer eid, PruebaEstudianteRequest pruebaEstudianteRequest) throws PruebaEstudianteException;

    void deletePruebaEstudiante(Integer eid) throws PruebaEstudianteException;

}
