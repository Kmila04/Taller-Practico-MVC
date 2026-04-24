package com.uniajc.servicios;

import com.uniajc.dao.EstudianteDao;
import com.uniajc.modelo.Estudiante;

public class EstudianteService {

    EstudianteDao dao = new EstudianteDao();

    public void registrarEstudiante(Estudiante estudiante) {
        dao.guardarEstudiante(estudiante);
    }
}