package com.uniajc.controlador;

import com.uniajc.modelo.Estudiante;
import com.uniajc.servicios.EstudianteService;

public class ControladorEstudiante {

    EstudianteService servicio = new EstudianteService();

    public void guardarEstudiante(Estudiante estudiante) {
        servicio.registrarEstudiante(estudiante);
    }
}