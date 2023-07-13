package com.consultas.proyecto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AvionDTO {

    private String codigo;

    private AerolineaDTO aerolinea;

    @Override
    public String toString() {
        return "AvionDTO{" +
                "codigo='" + codigo + '\'' +
                ", aerolinea=" + aerolinea +
                '}';
    }
}
