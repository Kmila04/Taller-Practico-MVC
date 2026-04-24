package com.uniajc.servicios;

import com.uniajc.dao.DocenteDao;
import com.uniajc.modelo.Docente;
public class DocenteService {

    DocenteDao dao = new DocenteDao();

    public void registrarDocente(Docente docente) {
        dao.guardarDocente(docente);
    }
}