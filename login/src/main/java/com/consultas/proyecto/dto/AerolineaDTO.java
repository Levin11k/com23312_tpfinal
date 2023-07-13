package com.consultas.proyecto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AerolineaDTO {

    private String nombre;

    @Override
    public String toString() {
        return "AerolineaDTO{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
