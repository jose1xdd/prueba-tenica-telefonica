package com.prueba.telefofica.service.imp;

import com.prueba.telefofica.model.dto.PruebaEstudianteDto;
import com.prueba.telefofica.model.entity.PruebaEstudiante;
import com.prueba.telefofica.model.request.PruebaEstudianteRequest;
import com.prueba.telefofica.repository.PruebaEstudianteRepository;
import com.prueba.telefofica.service.PruebaEstudianteService;
import com.prueba.telefofica.util.mapper.PruebaEstudianteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PruebaEstudianteServiceImp implements PruebaEstudianteService {

    private final PruebaEstudianteMapper pruebaEstudianteMapper;
    private final PruebaEstudianteRepository repository;

    @Override
    public PruebaEstudianteDto createPruebaEstudiante(PruebaEstudianteRequest pruebaEstudianteRequest) {
        PruebaEstudiante pruebaEstudiante = pruebaEstudianteMapper.mapToPruebaEstudiante(pruebaEstudianteRequest);
        pruebaEstudiante = repository.save(pruebaEstudiante);
        PruebaEstudianteDto result = this.pruebaEstudianteMapper.mapToPruebasEstudianteDto(pruebaEstudiante);
        return result;
    }

    @Override
    public PruebaEstudianteDto getPruebaEstudianteById(Integer eid) {
        return null;
    }

    @Override
    public void updatePruebaEstudiante(PruebaEstudianteRequest pruebaEstudianteRequest) {

    }

    @Override
    public void deletePruebaEstudiante(Integer eid) {

    }
}
