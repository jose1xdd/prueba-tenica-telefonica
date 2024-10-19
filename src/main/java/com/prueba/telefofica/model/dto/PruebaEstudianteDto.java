package com.prueba.telefofica.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PruebaEstudianteDto {
    private Integer eid;
    private String name;
    private String specialty;
    private String grade;
}
