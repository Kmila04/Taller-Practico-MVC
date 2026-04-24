package com.uniajc.controlador;

import com.uniajc.modelo.Docente;
import com.uniajc.servicios.DocenteService;

public class ControladorDocente {

    DocenteService servicio = new DocenteService();

    public void guardarDocente(Docente docente) {
        servicio.registrarDocente(docente);
    }
}
