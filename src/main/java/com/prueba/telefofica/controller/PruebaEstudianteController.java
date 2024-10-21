package com.prueba.telefofica.controller;

import com.prueba.telefofica.exception.PruebaEstudianteException;
import com.prueba.telefofica.model.dto.PruebaEstudianteDto;
import com.prueba.telefofica.model.request.PruebaEstudianteRequest;
import com.prueba.telefofica.service.imp.PruebaEstudianteServiceImp;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{idPrueba}")
    public ResponseEntity<PruebaEstudianteDto> getById(@PathVariable Integer idPrueba) throws PruebaEstudianteException {
        PruebaEstudianteDto pruebaEstudianteDto = this.pruebaEstudianteService.getPruebaEstudianteById(idPrueba);
        return new ResponseEntity<>(pruebaEstudianteDto, HttpStatus.OK);
    }

    @PutMapping("/{idPrueba}")
    public ResponseEntity<PruebaEstudianteDto> updateById(@PathVariable Integer idPrueba, @Valid @RequestBody PruebaEstudianteRequest pruebaEstudianteRequest) throws PruebaEstudianteException {
        PruebaEstudianteDto pruebaEstudianteDto = this.pruebaEstudianteService.updatePruebaEstudiante(idPrueba, pruebaEstudianteRequest);
        return new ResponseEntity<>(pruebaEstudianteDto, HttpStatus.OK);
    }

    @DeleteMapping("/{idPrueba}")
    public ResponseEntity<Void> deleteByid(@PathVariable Integer idPrueba) throws PruebaEstudianteException {
        this.pruebaEstudianteService.deletePruebaEstudiante(idPrueba);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
