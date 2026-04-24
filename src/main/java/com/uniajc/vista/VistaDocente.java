package com.uniajc.vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.uniajc.controlador.ControladorDocente;
import com.uniajc.modelo.Docente;

public class VistaDocente {

    Scanner sc = new Scanner(System.in);

    public void mostrarVista() {

        ControladorDocente controller = new ControladorDocente();

        int id;
        String nombre;
        String especialidad;

        id = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del docente"));
        nombre = JOptionPane.showInputDialog("Digite el nombre del docente");

        System.out.println("Digite la especialidad:");
        especialidad = sc.nextLine();

        Docente docente = new Docente(id, nombre, especialidad);

        controller.guardarDocente(docente);
    }
}