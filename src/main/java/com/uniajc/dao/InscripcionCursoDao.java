package com.uniajc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uniajc.config.ConexionDatabase;
import com.uniajc.modelo.InscripcionCurso;

public class InscripcionCursoDao {

    public void guardarInscripcion(InscripcionCurso inscripcion) {

        try {
            Connection conexion = ConexionDatabase.conectar();

            String sql = "INSERT INTO inscripcion_curso VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, inscripcion.getId_inscripcion());
            ps.setInt(2, inscripcion.getId_estudiante());
            ps.setInt(3, inscripcion.getId_grupo());
            ps.setFloat(4, inscripcion.getNota_final());
            ps.setString(5, inscripcion.getEstado());

            ps.executeUpdate();

            System.out.println("Inscripcion guardada correctamente");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}