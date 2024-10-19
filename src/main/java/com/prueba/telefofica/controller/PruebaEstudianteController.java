package com.prueba.telefofica.controller;

import com.prueba.telefofica.model.dto.PruebaEstudianteDto;
import com.prueba.telefofica.model.request.PruebaEstudianteRequest;
import com.prueba.telefofica.service.imp.PruebaEstudianteServiceImp;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("${controller.properties.base-path}")
public class PruebaEstudianteController {

    private final PruebaEstudianteServiceImp pruebaEstudianteService;


    @PostMapping("/create")
    public ResponseEntity<PruebaEstudianteDto> create(@Valid @RequestBody PruebaEstudianteRequest pruebaEstudianteRequest) {
        PruebaEstudianteDto pruebaEstudianteDto = this.pruebaEstudianteService.createPruebaEstudiante(pruebaEstudianteRequest);
        return new ResponseEntity<>(pruebaEstudianteDto, HttpStatus.CREATED);
    }
}
