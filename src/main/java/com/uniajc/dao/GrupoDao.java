package com.uniajc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uniajc.config.ConexionDatabase;
import com.uniajc.modelo.Grupo;

public class GrupoDao {

    public void guardarGrupo(Grupo grupo) {

        try {
            Connection conexion = ConexionDatabase.conectar();

            String sql = "INSERT INTO grupo VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, grupo.getId_grupo());
            ps.setInt(2, grupo.getId_materia());
            ps.setInt(3, grupo.getId_docente());
            ps.setString(4, grupo.getAula());
            ps.setString(5, grupo.getHorario());

            ps.executeUpdate();

            System.out.println("Grupo guardado correctamente");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}