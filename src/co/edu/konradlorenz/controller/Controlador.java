package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.controller.batalla.Batalla;
import co.edu.konradlorenz.controller.persistencia.ArchivosConexion;
import co.edu.konradlorenz.model.entrenador.Entrenador;
import co.edu.konradlorenz.model.pokemon.*;
import co.edu.konradlorenz.view.Vista;
import co.edu.konradlorenz.model.pokemon.PokemonFactory;
import java.io.Serializable;
import java.util.LinkedList;

public class Controlador implements Serializable {

    // Configuración
    private boolean guardar = false; // Cambiar manualmente
    final public int sg = 2; // Interacion manual -> Oriniginalmente 2 segundos

    // Listas principales
    private LinkedList<Pokemon> pokemonesDisponibles;
    private LinkedList<Entrenador> pokeEntrenadores;

    // Nombres de archivos
    final String Archivo_Pokemones = "ListaDePokemones.pokechangua";
    final String Archivo_Entrenadores = "ListaDeEntrenadores.pokechangua";

    // Complejidad temporal: O(1) Tiempo constante
    public void run() {

        leerDatosGuardados(Archivo_Pokemones, Archivo_Entrenadores);

        boolean ejecutar = true;

        while (ejecutar) {
            switch (Vista.menuPrincipal()) {
                case 1: // Batalla Pokemon
                    gestionarBatallaPokemon();
                    break;
                case 2: // Crear entrenador
                    gestionarNuevoEntrenador();
                    break;
                case 3: // Ver entrenadores
                    verEntrenadores();
                    break;
                case 4: // Salir
                    if (guardar) {
                        guardarPartida(pokemonesDisponibles, pokeEntrenadores);
                    }
                    ejecutar = false;
                    break;
                default:
                    Vista.mostrarMensaje("Opción no válida");
                    break;
            }
        }
    }

    @SuppressWarnings("unused")
    // Complejidad temporal: O(1) Tiempo constante
    private void cargarPrimerosPokemon() {
        pokemonesDisponibles = PokemonFactory.crearPokemonesIniciales();
        ArchivosConexion.guardar(pokemonesDisponibles, Archivo_Pokemones);
        ArchivosConexion.guardar(pokeEntrenadores, Archivo_Entrenadores);
    }

    @SuppressWarnings("unchecked")
    // Complejidad temporal: O(1) Tiempo constante
    private void leerDatosGuardados(String Archivo_Pokemones, String Archivo_Entrenadores) {
        try {
            pokemonesDisponibles = (LinkedList<Pokemon>) ArchivosConexion.leer(Archivo_Pokemones);
            pokeEntrenadores = (LinkedList<Entrenador>) ArchivosConexion.leer(Archivo_Entrenadores);
            
            if (pokemonesDisponibles == null) {
                cargarPrimerosPokemon();
            }
            if (pokeEntrenadores == null) {
                pokeEntrenadores = new LinkedList<>();
            }
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al cargar datos: " + e.getMessage());
            cargarPrimerosPokemon();
            pokeEntrenadores = new LinkedList<>();
        }
    }

    // Complejidad temporal: O(1) Tiempo constante
    public void guardarPartida(LinkedList<Pokemon> pokemonesDisponibles, LinkedList<Entrenador> pokeEntrenadores) {
        try {
            if (pokemonesDisponibles != null) {
                ArchivosConexion.guardar(pokemonesDisponibles, Archivo_Pokemones);
            }
            if (pokeEntrenadores != null) {
                ArchivosConexion.guardar(pokeEntrenadores, Archivo_Entrenadores);
            }
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al guardar datos: " + e.getMessage());
        }
    }

    // Complejidad temporal: O(1) Tiempo constante
    public void wait(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Complejidad temporal: O(1) Tiempo constante
    private void gestionarBatallaPokemon() {
        if (pokeEntrenadores.isEmpty()) {
            Vista.mostrarMensaje("¡No hay entrenadores registrados para batallar!");
            return;
        }

        Batalla batalla = new Batalla(pokeEntrenadores);
        batalla.iniciarPreparacion();
    }

    private void gestionarNuevoEntrenador() {
        try {
            if (pokemonesDisponibles == null || pokemonesDisponibles.isEmpty()) {
                Vista.mostrarMensaje("¡No hay pokémon disponibles para asignar al entrenador!");
                return;
            }

            String nombre = Vista.pedirString("Ingrese el nombre del nuevo entrenador");
            if (nombre == null || nombre.trim().isEmpty()) {
                Vista.mostrarMensaje("El nombre no puede estar vacío");
                return;
            }

            LinkedList<Pokemon> equipoPokemon = new LinkedList<>();
            Entrenador nuevoEntrenador = new Entrenador(nombre, equipoPokemon);
            
            mostrarPokemonesDisponibles();
            int seleccion = Integer.parseInt(Vista.pedirString("Seleccione el número del Pokémon inicial")) - 1;
            
            if (seleccion >= 0 && seleccion < pokemonesDisponibles.size()) {
                Pokemon pokemonInicial = pokemonesDisponibles.get(seleccion);
                nuevoEntrenador.agregarPokemon(pokemonInicial);
                if (pokeEntrenadores == null) {
                    pokeEntrenadores = new LinkedList<>();
                }
                pokeEntrenadores.add(nuevoEntrenador);
                Vista.mostrarMensaje("¡Entrenador creado exitosamente!");
            } else {
                Vista.mostrarMensaje("Selección de Pokémon inválida");
            }
        } catch (NumberFormatException e) {
            Vista.mostrarMensaje("Error: Entrada numérica inválida");
        } catch (Exception e) {
            Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
        }
    }

    private void mostrarPokemonesDisponibles() {
        Vista.espacioVisual();
        Vista.mostrarLinea(" <> = = = = = = = = = = POKÉMON DISPONIBLES = = = = = = = = = = <>");
        for (int i = 0; i < pokemonesDisponibles.size(); i++) {
            Pokemon pokemon = pokemonesDisponibles.get(i);
            Vista.mostrarLinea("    [" + (i + 1) + "] " + pokemon.getNombre() + 
                             "     Salud: " + pokemon.getSalud() + 
                             "     Ataque: " + pokemon.getPuntosDeAtaque() + 
                             "     Tipo: " + pokemon.getTipo());
        }
        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = = = <>\n");
    }

    private void verEntrenadores() {
        if (pokeEntrenadores.isEmpty()) {
            Vista.mostrarMensaje("No hay entrenadores registrados");
            return;
        }

        Vista.espacioVisual();
        Vista.mostrarLinea(" <> = = = = = = = = = = ENTRENADORES = = = = = = = = = = <>");
        for (int i = 0; i < pokeEntrenadores.size(); i++) {
            Vista.mostrarLinea("    [" + (i + 1) + "] " + pokeEntrenadores.get(i).getNombre());
            pokeEntrenadores.get(i).mostrarPokemones();
        }
        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = <>\n");
    }

}
