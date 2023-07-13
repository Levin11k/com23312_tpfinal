package com.consultas.proyecto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AsientoDTO {

    private String fila;
    private String columna;

    @Override
    public String toString() {
        return "AsientoDTO{" +
                "fila='" + fila + '\'' +
                ", columna='" + columna + '\'' +
                '}';
    }
}
