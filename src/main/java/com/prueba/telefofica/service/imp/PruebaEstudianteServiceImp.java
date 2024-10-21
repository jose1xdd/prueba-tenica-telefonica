package com.prueba.telefofica.service.imp;

import com.prueba.telefofica.exception.PruebaEstudianteException;
import com.prueba.telefofica.model.dto.PruebaEstudianteDto;
import com.prueba.telefofica.model.entity.PruebaEstudiante;
import com.prueba.telefofica.model.request.PruebaEstudianteRequest;
import com.prueba.telefofica.repository.PruebaEstudianteRepository;
import com.prueba.telefofica.service.PruebaEstudianteService;
import com.prueba.telefofica.util.mapper.PruebaEstudianteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PruebaEstudianteServiceImp implements PruebaEstudianteService {

    private final PruebaEstudianteMapper pruebaEstudianteMapper;
    private final PruebaEstudianteRepository repository;

    @Override
    public PruebaEstudianteDto createPruebaEstudiante(PruebaEstudianteRequest pruebaEstudianteRequest) {
        PruebaEstudiante pruebaEstudiante = pruebaEstudianteMapper.mapToPruebaEstudiante(pruebaEstudianteRequest);
        pruebaEstudiante = repository.save(pruebaEstudiante);
        return this.pruebaEstudianteMapper.mapToPruebasEstudianteDto(pruebaEstudiante);
    }

    @Override
    public PruebaEstudianteDto getPruebaEstudianteById(Integer eid) throws PruebaEstudianteException {
        Optional<PruebaEstudiante> query = this.repository.findById(eid);
        if (query.isEmpty()) throw new PruebaEstudianteException("no se encontro la PruebaEstudiante");
        PruebaEstudiante pruebaEstudiante = query.get();
        return this.pruebaEstudianteMapper.mapToPruebasEstudianteDto(pruebaEstudiante);
    }

    @Override
    public PruebaEstudianteDto updatePruebaEstudiante(Integer eid, PruebaEstudianteRequest pruebaEstudianteRequest) throws PruebaEstudianteException {
        PruebaEstudiante pruebaEstudiante = pruebaEstudianteMapper.mapToPruebaEstudiante(pruebaEstudianteRequest);
        Optional<PruebaEstudiante> query = this.repository.findById(eid);
        if (query.isEmpty()) throw new PruebaEstudianteException("no se encontro la PruebaEstudiante");
        pruebaEstudiante.setEid(eid);
        this.repository.save(pruebaEstudiante);
        return this.pruebaEstudianteMapper.mapToPruebasEstudianteDto(pruebaEstudiante);
    }

    @Override
    public void deletePruebaEstudiante(Integer eid) throws PruebaEstudianteException {
        Optional<PruebaEstudiante> query = this.repository.findById(eid);
        if (query.isEmpty()) throw new PruebaEstudianteException("no se encontro la PruebaEstudiante");
        this.repository.deleteById(eid);
    }
}
