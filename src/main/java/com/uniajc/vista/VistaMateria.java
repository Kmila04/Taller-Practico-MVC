package com.uniajc.vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.uniajc.controlador.ControladorMateria;
import com.uniajc.modelo.Materia;

public class VistaMateria {

    Scanner sc = new Scanner(System.in);

    public void mostrarVista() {

        ControladorMateria controller = new ControladorMateria();

        int id;
        String nombre;
        int creditos;

        id = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID de la materia"));
        nombre = JOptionPane.showInputDialog("Digite el nombre de la materia");

        System.out.println("Digite los creditos:");
        creditos = sc.nextInt();

        Materia materia = new Materia(id, nombre, creditos);

        controller.guardarMateria(materia);
    }
    
}