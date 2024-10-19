package com.prueba.telefofica.util.mapper;

import com.prueba.telefofica.config.MapStructConfig;
import com.prueba.telefofica.model.dto.PruebaEstudianteDto;
import com.prueba.telefofica.model.entity.PruebaEstudiante;
import com.prueba.telefofica.model.request.PruebaEstudianteRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(config = MapStructConfig.class)
public interface PruebaEstudianteMapper {
    PruebaEstudiante mapToPruebaEstudiante(PruebaEstudianteRequest pruebaEstudianteRequest);
    PruebaEstudianteDto mapToPruebasEstudianteDto(PruebaEstudiante pruebaEstudiante);

    void mapToPruebaEstudiante(@MappingTarget PruebaEstudianteRequest pruebaEstudianteRequest, PruebaEstudianteDto pruebaEstudianteDto);

}
