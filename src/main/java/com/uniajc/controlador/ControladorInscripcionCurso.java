package com.uniajc.controlador;

import com.uniajc.modelo.InscripcionCurso;
import com.uniajc.servicios.InscripcionCursoService;

public class ControladorInscripcionCurso {

    InscripcionCursoService servicio = new InscripcionCursoService();

    public void guardarInscripcion(InscripcionCurso inscripcion) {
        servicio.registrarInscripcion(inscripcion);
    }
}