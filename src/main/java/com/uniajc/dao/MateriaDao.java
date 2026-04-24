package com.uniajc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uniajc.config.ConexionDatabase;
import com.uniajc.modelo.Materia;

public class MateriaDao {

    public void guardarMateria(Materia materia) {

        try {
            Connection conexion = ConexionDatabase.conectar();

            String sql = "INSERT INTO materia VALUES (?, ?, ?)";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, materia.getId_materia());
            ps.setString(2, materia.getNombre_materia());
            ps.setInt(3, materia.getCreditos());

            ps.executeUpdate();

            System.out.println("Materia guardada correctamente");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
