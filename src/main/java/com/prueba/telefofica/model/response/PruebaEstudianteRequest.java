package com.prueba.telefofica.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PruebaEstudianteRequest {
    private Integer eid;
    private String name;
    private String specialty;
    private String grade;
}
