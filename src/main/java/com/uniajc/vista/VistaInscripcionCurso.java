package com.uniajc.vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.uniajc.controlador.ControladorInscripcionCurso;
import com.uniajc.modelo.InscripcionCurso;

public class VistaInscripcionCurso {

    Scanner sc = new Scanner(System.in);

    public void mostrarVista() {

        ControladorInscripcionCurso controller = new ControladorInscripcionCurso();

        int idInscripcion;
        int idEstudiante;
        int idGrupo;
        float nota;
        String estado;

        idInscripcion = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID de la inscripcion"));
        idEstudiante = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del estudiante"));
        idGrupo = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del grupo"));

        System.out.println("Digite la nota final:");
        nota = sc.nextFloat();
        sc.nextLine();

        System.out.println("Digite el estado:");
        estado = sc.nextLine();

        InscripcionCurso inscripcion = new InscripcionCurso(idInscripcion, idEstudiante, idGrupo, nota, estado);

        controller.guardarInscripcion(inscripcion);
    }
}
