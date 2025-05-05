package co.edu.konradlorenz.controller;

import java.util.*;

import co.edu.konradlorenz.model.entrenador.*;
import co.edu.konradlorenz.model.persistencia.*;
import co.edu.konradlorenz.model.pokemon.*;
import co.edu.konradlorenz.view.*;

class ControllerPersistencia {

    // Nombres de archivos data
    private static final String archivoPokemones = "PokemonesDisponibles.pokemondongo";
    private static final String archivoEntrenadores = "EntrenadoresRegistrados.pokemondongo";

    // Carga los datos de pokemones y entrenadores desde
    // los archivos y los inicializa si no existen.
    @SuppressWarnings("unchecked")
    public static void cargarDatos() {
        try {
            // Intenta cargar la lista de POKEMONES desde el archivo local
            ControllerPokemon.listaPokemonesPokeMondonGo = (LinkedList<Pokemon>) ArchivosConexion
                    .leer(archivoPokemones);

            // Si no hay pokemones, crea los iniciales
            if (ControllerPokemon.listaPokemonesPokeMondonGo == null) {

                // Crea los pokemones iniciales
                ControllerPokemon.listaPokemonesPokeMondonGo = PokemonFactory.crearPokemonesIniciales();
                Vista.mostrarMensaje("¡Lista de Pokemones Iniciales creada exitosamente!");
                ArchivosConexion.guardar(ControllerPokemon.listaPokemonesPokeMondonGo, archivoPokemones);
                Vista.mostrarMensaje("¡Lista de Pokemones guardada exitosamente!");

            } else {
                Vista.mostrarMensaje("¡Lista de Pokémon cargada exitosamente!");
            }

            // Intenta cargar la lista de ENTRENADORES desde el archivo local
            ControllerEntrenador.listaEntrenadoresPokeMondonGo = (LinkedList<Entrenador>) ArchivosConexion
                    .leer(archivoEntrenadores);

            // Si no hay entrenadores, inicializa una lista vacía
            if (ControllerEntrenador.listaEntrenadoresPokeMondonGo == null) {
                
                // Inicializa la lista vacía
                ControllerEntrenador.listaEntrenadoresPokeMondonGo = new LinkedList<>();
                Vista.mostrarMensaje("¡Lista de Entrenadores creada exitosamente!");
                ArchivosConexion.guardar(ControllerEntrenador.listaEntrenadoresPokeMondonGo, archivoEntrenadores);
                Vista.mostrarMensaje("¡Lista de Entrenadores guardada exitosamente!");

            } else {
                Vista.mostrarMensaje("¡Lista de Entrenadores cargada exitosamente!");
            }

        } catch (Exception e) {
            Vista.mostrarMensaje("Error al cargar datos: ");
            e.printStackTrace();
        } // try-catch

    }// cargarDatos

    public static void guardarDatos(LinkedList<Pokemon> pokemonesDisponibles, LinkedList<Entrenador> pokeEntrenadores) {
        try {
            if (pokemonesDisponibles != null) {
                ArchivosConexion.guardar(pokemonesDisponibles, archivoPokemones);
            }
            if (pokeEntrenadores != null) {
                ArchivosConexion.guardar(pokeEntrenadores, archivoEntrenadores);
            }
        } catch (NullPointerException e) {
            Vista.mostrarMensaje("Null Pointer al guardar los datos: ");
            e.printStackTrace();
        } catch (Exception e) {
            Vista.mostrarMensaje("Error desconocido al guardar los datos");
            e.printStackTrace();
        } // try-catch

    }// guardarPartida

    public static void borrarDatos() {
        try {
            ArchivosConexion.borrar(archivoPokemones);
            ArchivosConexion.borrar(archivoEntrenadores);
            Vista.mostrarMensaje("¡Archivos borrados exitosamente!");
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al borrar los archivos: ");
            e.printStackTrace();
        } // try-catch
    }// borrarDatos

}// class