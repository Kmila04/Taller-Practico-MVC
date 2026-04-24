package com.uniajc;

import java.util.Scanner;

import com.uniajc.vista.VistaDocente;
import com.uniajc.vista.VistaEstudiante;
import com.uniajc.vista.VistaGrupo;
import com.uniajc.vista.VistaInscripcionCurso;
import com.uniajc.vista.VistaMateria;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar docente");
            System.out.println("3. Registrar materia");
            System.out.println("4. Registrar grupo");
            System.out.println("5. Registrar inscripcion");
            System.out.println("6. Salir");

            System.out.print("Digite una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    VistaEstudiante vistaEstudiante = new VistaEstudiante();
                    vistaEstudiante.mostrarVista();

                    break;

                case 2:

                    VistaDocente vistaDocente = new VistaDocente();
                    vistaDocente.mostrarVista();

                    break;

                case 3:

                    VistaMateria vistaMateria = new VistaMateria();
                    vistaMateria.mostrarVista();

                    break;

                case 4:

                    VistaGrupo vistaGrupo = new VistaGrupo();
                    vistaGrupo.mostrarVista();

                    break;

                case 5:

                    VistaInscripcionCurso vistaInscripcion =
                            new VistaInscripcionCurso();

                    vistaInscripcion.mostrarVista();

                    break;

                case 6:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opcion invalida");

            }

        } while (opcion != 6);

    }
}