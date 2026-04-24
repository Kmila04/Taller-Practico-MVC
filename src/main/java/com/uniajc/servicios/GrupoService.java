package com.uniajc.servicios;

import com.uniajc.dao.GrupoDao;
import com.uniajc.modelo.Grupo;

public class GrupoService {

    GrupoDao dao = new GrupoDao();

    public void registrarGrupo(Grupo grupo) {
        dao.guardarGrupo(grupo);
    }
}