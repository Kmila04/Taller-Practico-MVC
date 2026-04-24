package com.uniajc.controlador;

import com.uniajc.modelo.Grupo;
import com.uniajc.servicios.GrupoService;

public class ControladorGrupo {

    GrupoService servicio = new GrupoService();

    public void guardarGrupo(Grupo grupo) {
        servicio.registrarGrupo(grupo);
    }
}