package co.edu.konradlorenz.controller;

import java.util.LinkedList;
import co.edu.konradlorenz.model.entrenador.Entrenador;
import co.edu.konradlorenz.model.pokemon.Pokemon;
import co.edu.konradlorenz.view.Vista;
import co.edu.konradlorenz.view.VistaMenu;

class ControllerEntrenador {

    static LinkedList<Entrenador> listaEntrenadoresPokeMondonGo;

    public void gestionarEntrenadores() {
        VistaMenu.menuGestionarEntrenadores();
        mostrarEntrenadores(); //TODO: Esto es temporal acá se debe manejar la siguiente logica de la VistaMenu
    }// gestionarEntrenadores()

    public static void mostrarEntrenadores() {

        if (listIsEmpty()) return;

        Vista.espacioVisual();
        Vista.espacioVisual();
        Vista.mostrarLinea(" <> = = = = = = = = = = ENTRENADORES = = = = = = = = = = <>");
        
        for (int i = 0; i < listaEntrenadoresPokeMondonGo.size(); i++) {

            Vista.mostrarLinea("    [ ⌘ ] " + ControllerEntrenador.listaEntrenadoresPokeMondonGo.get(i).getNombre());

        }// for

        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = <>\n");
        Vista.pedirDato("Presione ENTER para continuar...");
    
    }// mostrarEntrenadores()

    public static void seleccionarEntrenadores() {

        if (listIsEmpty()) return;
        
        Vista.espacioVisual();
        Vista.espacioVisual();
        Vista.mostrarLinea(" <> = = = = = = = = = = ENTRENADORES = = = = = = = = = = <>");
        
        for (int i = 0; i < listaEntrenadoresPokeMondonGo.size(); i++) {

            Vista.mostrarLinea("    [" + (i + 1) + "] " + ControllerEntrenador.listaEntrenadoresPokeMondonGo.get(i).getNombre());

            // listaEntrenadoresPokeMondonGo.get(i).mostrarPokemones();

        }// for

        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = <>\n");
    
    }// seleccionarEntrenadores()

	public void crearNuevoEntrenador() {

		try {
            if (ControllerPokemon.listaPokemonesPokeMondonGo == null
                    || ControllerPokemon.listaPokemonesPokeMondonGo.isEmpty()) {
                Vista.mostrarMensaje("¡No hay pokémon disponibles para asignar al entrenador!");
                return;
            }

            String nombre = Vista.pedirDato("Ingrese el nombre del nuevo entrenador");
            if (nombre == null || nombre.trim().isEmpty()) {
                Vista.mostrarMensaje("El nombre no puede estar vacío");
                return;
            }

            LinkedList<Pokemon> equipoPokemon = ControllerPokemon.listaPokemonesPokeMondonGo;
            Entrenador nuevoEntrenador = new Entrenador(nombre, equipoPokemon);
            Vista.mostrarMensaje("Entrenador creado exitosamente: " + nuevoEntrenador.getNombre());
            listaEntrenadoresPokeMondonGo.add(nuevoEntrenador);
            Vista.mostrarMensaje(nuevoEntrenador.getNombre() + " fue agregado/a a la lista de entrenadores");

        } catch (NumberFormatException e) {
            Vista.mostrarMensaje("Por favor ingrese un número válido");
        } catch (Exception e) {
            Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }// try-catch

	}// crearNuevoEntrenador()

    public static boolean listIsEmpty() {
        if (listaEntrenadoresPokeMondonGo.isEmpty()) {
            Vista.mostrarMensaje("¡No hay entrenadores registrados!");
            return true;
        }
        return false;

    }// listIsEmpty()

}// class
