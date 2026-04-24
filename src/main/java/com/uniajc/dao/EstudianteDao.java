package com.uniajc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uniajc.config.ConexionDatabase;
import com.uniajc.modelo.Estudiante;

public class EstudianteDao {

    public void guardarEstudiante(Estudiante estudiante) {

        try {

            Connection conexion = ConexionDatabase.conectar();

            String sql = "INSERT INTO estudiante VALUES (?, ?, ?, ?)";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, estudiante.getId_estudiante());
            ps.setString(2, estudiante.getNombre());
            ps.setString(3, estudiante.getApellido());
            ps.setString(4, estudiante.getEmail());

            ps.executeUpdate();

            System.out.println("Estudiante guardado correctamente");

        } catch (SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}