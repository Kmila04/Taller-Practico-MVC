package com.uniajc.servicios;

import com.uniajc.dao.MateriaDao;
import com.uniajc.modelo.Materia;

public class MateriaService {

    MateriaDao dao = new MateriaDao();

    public void registrarMateria(Materia materia) {
        dao.guardarMateria(materia);
    }
}