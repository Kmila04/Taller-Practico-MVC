package com.uniajc.vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.uniajc.controlador.ControladorEstudiante;
import com.uniajc.modelo.Estudiante;

public class VistaEstudiante {

    Scanner sc = new Scanner(System.in);

    public void mostrarVista() {

        ControladorEstudiante controller = new ControladorEstudiante();

        int id;
        String nombre;
        String apellido;
        String email;

        id = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID"));
        nombre = JOptionPane.showInputDialog("Digite el nombre");

        System.out.println("Digite el apellido:");
        apellido = sc.nextLine();

        System.out.println("Digite el email:");
        email = sc.nextLine();

        Estudiante estudiante = new Estudiante(id, nombre, apellido, email);

        controller.guardarEstudiante(estudiante);
    }
}
