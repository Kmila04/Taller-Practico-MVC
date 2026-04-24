package com.uniajc.controlador;

import com.uniajc.modelo.Materia;
import com.uniajc.servicios.MateriaService;

public class ControladorMateria {

    MateriaService servicio = new MateriaService();

    public void guardarMateria(Materia materia) {
        servicio.registrarMateria(materia);
    }
}