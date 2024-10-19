package com.prueba.telefofica.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PRUEBAESTUDIANTE")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PruebaEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Eid")
    private Integer eid;

    @Column(name = "Nombre")
    private String name;

    @Column(name = "Especialidad")
    private String specialty;

    @Column(name = "Grado")
    private String grade;

}
