package com.consultas.proyecto.service;

import com.consultas.proyecto.dto.ReservaDTO;
import com.consultas.proyecto.repository.MetodoDePagoRepository;
import com.consultas.proyecto.repository.ReservaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class ReservaServiceTest {

    @Mock
    ReservaRepository reservaRepository;





    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Test para el camino correcto del método crearReserva")
    void crearReservaOkTest() {
        // Arrange

        ReservaDTO reservaDTO = new ReservaDTO();
    }

    @Test
    void verReservasDeUnUsuario() {
    }

    @Test
    void realizandoDescuentoOkTest() {

        // Arrange: Definir los parámetros con valores  que deba recibir el método a testear


    }
}