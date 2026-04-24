package com.uniajc.servicios;

import com.uniajc.dao.InscripcionCursoDao;
import com.uniajc.modelo.InscripcionCurso;

public class InscripcionCursoService {

    InscripcionCursoDao dao = new InscripcionCursoDao();

    public void registrarInscripcion(InscripcionCurso inscripcion) {
        dao.guardarInscripcion(inscripcion);
    }
}