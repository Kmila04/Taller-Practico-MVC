package com.uniajc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uniajc.config.ConexionDatabase;
import com.uniajc.modelo.Docente;

public class DocenteDao {

    public void guardarDocente(Docente docente) {

        try {

            Connection conexion = ConexionDatabase.conectar();

            String sql = "INSERT INTO docente VALUES (?, ?, ?)";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, docente.getId_docente());
            ps.setString(2, docente.getNombre());
            ps.setString(3, docente.getEspecialidad());

            ps.executeUpdate();

            System.out.println("Docente guardado correctamente");

        } catch (SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}