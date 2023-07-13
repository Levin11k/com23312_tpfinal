package com.consultas.proyecto.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AsientoVueloDTO {


    private AsientoDTO asiento;


    private Boolean estaLibre;


    private Double precio;

    @Override
    public String toString() {
        return "AsientoVueloDTO{" +
                "asiento=" + asiento +
                ", estaLibre=" + estaLibre +
                ", precio=" + precio +
                '}';
    }
}
