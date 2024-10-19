package com.prueba.telefofica.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PruebaEstudianteRequest {
    @JsonProperty("nombre")
    @NotNull(message = "El nombre es obligatorio")
    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;

    @JsonProperty("especialidad")
    @NotNull(message = "La especialidad es obligatoria")
    @NotBlank(message = "La especialidad no puede estar vacía")
    private String specialty;

    @JsonProperty("grado")
    @NotNull(message = "El grado es obligatorio")
    @NotBlank(message = "El grado no puede estar vacío")
    private String grade;
}
