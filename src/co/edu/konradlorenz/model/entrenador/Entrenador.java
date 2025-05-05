package co.edu.konradlorenz.model.entrenador;

import co.edu.konradlorenz.model.pokemon.Pokemon;
import co.edu.konradlorenz.view.Vista;
import java.io.Serializable;
import java.util.LinkedList;

public class Entrenador implements Serializable {
    private String nombre;
    private LinkedList<Pokemon> pokeLista;

    public Entrenador(String nombre, LinkedList<Pokemon> pokeLista) {
        this.nombre = nombre;
        this.pokeLista = pokeLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Pokemon> getPokeLista() {
        return pokeLista;
    }

    public void agregarPokemon(Pokemon pokemon) {
        try {
            if (pokemon == null) {
                Vista.mostrarMensaje("Error: No se puede agregar un Pokémon nulo");
                return;
            }
            pokeLista.add(pokemon);
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al agregar Pokémon: " + e.getMessage());
        }// try-catch

    }// agregarPokemon

    public void entrenarPokemon(Pokemon pokemon) {

        try {
            
            if (pokemon == null) {
                Vista.mostrarMensaje("Error: No se puede entrenar un Pokémon nulo");
                return;
            }// if

            pokemon.entrenar();

        } catch (Exception e) {
            Vista.mostrarMensaje("Error al entrenar Pokémon: " + e.getMessage());
        }// try-catch

    }// entrenarPokemon

    public void mostrarPokemones() {
        
        try {

            if (pokeLista == null || pokeLista.isEmpty()) {
                Vista.mostrarMensaje(" <> ¡ Oh oh, no tienes pokemones ! <> ");
                return;
            }

            Vista.mostrarMensaje("Cargando lista de pokemones...");

            Vista.espacioVisual();
            Vista.mostrarLinea(
                    " <> = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");

            for (Pokemon pokemon : pokeLista) {
                
                if (pokemon != null) {
                    Vista.mostrarLinea("    [" + (pokeLista.indexOf(pokemon) + 1) + "]  " + pokemon.getNombre() +
                            "     Salud -> " + pokemon.getSalud() +
                            "     Ataque -> " + pokemon.getPuntosDeAtaque() +
                            "     Tipo -> " + pokemon.getTipo() +
                            "     Estado -> " + pokemon.getEstado());
                }// if

            }// for

            Vista.mostrarLinea(
                    " <> = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = <>\n\n");

        } catch (Exception e) {
            Vista.mostrarMensaje("Error al mostrar Pokémon: " + e.getMessage());
        }// try-catch

    }// mostrarPokemones

}// class
