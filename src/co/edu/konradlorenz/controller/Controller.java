package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.entrenador.*;
import co.edu.konradlorenz.model.pokemon.*;
import co.edu.konradlorenz.view.*;
import java.io.*;
import java.util.*;

public class Controller implements Serializable {

    // Configuración
    static boolean autoguardado = false; // Cambiar manualmente
    private static final int sg = 2; // Interacion manual -> Originalmente 2 segundos

    public void run() {

        ControllerPersistencia.cargarDatos(); // Cargar datos de data

        boolean run = true; // Variable de control del menú

        do {
            VistaMenu.menuPrincipal();

            int opcion;

            try {

                opcion = seleccionarOpcion();

            } catch (NumberFormatException e) {
                Vista.mostrarMensaje("Por favor ingrese un número válido");
                continue; // Retorna al inicio del do-while
            } catch (Exception e) {
                Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
                e.printStackTrace();
                continue; // Retorna al inicio del do-while
            } // try-catch

            switch (opcion) {
                case 1: // Batalla Pokémon
                    crearBatallaPokemon();
                    break;
                case 2: // Crear entrenador
                    crearNuevoEntrenador();
                    break;
                case 3: // Ver entrenadores
                    gestionarEntrenadores();
                    break;
                case 123: // Switch autoguardado
                    switchAutoGuardado();
                    break;
                case 0: // Salir
                    boolean continuar;
                    do {
                        continuar = false;
                        if (autoguardado) {
                            Vista.mostrarMensaje(
                                    "El autoguardado está activado. Los datos se guardarán automáticamente.");
                            Vista.mostrarMensaje("Guardando datos...");
                            ControllerPersistencia.guardarDatos(
                                    ControllerPokemon.listaPokemonesPokeMondonGo,
                                    ControllerEntrenador.listaEntrenadoresPokeMondonGo);
                            Vista.mostrarMensaje("Datos guardados exitosamente");
                        } else {
                            Vista.mostrarMensaje("El autoguardado está desactivado. Los datos NO se guardarán.");
                            String borrar = Vista.pedirDato("¿Desea borrar los datos? (S/N)");
                            if (borrar != null && borrar.toUpperCase().equals("S")) {
                                borrar = Vista.pedirDato(" [ ESTÁ ACCIÓN NO SE PUEDE DESHACER ]\n"
                                        + "¿Está seguro que desea borrar los datos? (S/N)");
                                if (borrar != null && borrar.toUpperCase().equals("S")) {
                                    ControllerPersistencia.borrarDatos();
                                    Vista.mostrarMensaje("Memoria de PokeMondonGo V3 vacía");
                                } else if (borrar != null && borrar.equals("123")) {
                                    switchAutoGuardado();
                                    continuar = true;
                                } else
                                    Vista.mostrarMensaje("Ninguno dato fue borrado");
                            } else if (borrar != null && borrar.equals("123")) {
                                switchAutoGuardado();
                                continuar = true;
                            } else
                                Vista.mostrarMensaje("Ninguno dato fue borrado");
                        } // if
                    } while (continuar);

                    run = false;

                    Vista.pikaPika();

                    break;
                default:
                    Vista.mostrarMensaje("Opción no válida");
                    break;
            }// switch

        } while (run);

    }// run()

    private void gestionarEntrenadores() {
        new ControllerEntrenador().gestionarEntrenadores();
    }// gestionarEntrenadores()

    private void crearBatallaPokemon() {
        // Verifica si la lista de entrenadores está vacía
        boolean listaVacia = ControllerEntrenador.listIsEmpty();

        if (!listaVacia)
            new ControllerBatalla().runBatallaPokemon();

    }// crearBatallaPokemon()

    private void crearNuevoEntrenador() {
        new ControllerEntrenador().crearNuevoEntrenador();
    }// crearNuevoEntrenador()

    public static int seleccionarOpcion() {
        int opcion = -1;
        try {
            opcion = Integer.parseInt(Vista.pedirDato("Seleccione una opción"));
        } catch (NumberFormatException e) {
            Vista.mostrarMensaje("Por favor ingrese un número válido");
            return opcion; // Retorna al inicio del do-while
        } catch (Exception e) {
            Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
            e.printStackTrace();
            return opcion; // Retorna al inicio del do-while
        }
        return opcion; // Retorna al inicio del do-while
    }// seleccionarOpcion()

    private void switchAutoGuardado() {
        autoguardado = !autoguardado;
        if (autoguardado) {
            Vista.mostrarMensaje("Autoguardado activado");
        } else {
            Vista.mostrarMensaje("Autoguardado desactivado");
        }
    }// switchAutoGuardado()

    public static void delay() {
        int sec = Controller.sg;
        try {
            Thread.sleep(sec * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// delay()

}// class