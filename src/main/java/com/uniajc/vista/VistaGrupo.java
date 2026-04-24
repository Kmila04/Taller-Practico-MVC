package com.uniajc.vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.uniajc.controlador.ControladorGrupo;
import com.uniajc.modelo.Grupo;

public class VistaGrupo {

    Scanner sc = new Scanner(System.in);

    public void mostrarVista() {

        ControladorGrupo controller = new ControladorGrupo();

        int idGrupo;
        int idMateria;
        int idDocente;
        String aula;
        String horario;

        idGrupo = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del grupo"));
        idMateria = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID de la materia"));
        idDocente = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del docente"));

        System.out.println("Digite el aula:");
        aula = sc.nextLine();

        System.out.println("Digite el horario:");
        horario = sc.nextLine();

        Grupo grupo = new Grupo(idGrupo, idMateria, idDocente, aula, horario);

        controller.guardarGrupo(grupo);
    }
}
