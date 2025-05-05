package co.edu.konradlorenz.controller;

import java.util.*;
import co.edu.konradlorenz.model.pokemon.*;
import co.edu.konradlorenz.view.*;

class ControllerPokemon {
    static LinkedList<Pokemon> listaPokemonesPokeMondonGo;
    
    public void mostrarPokemones() {

        Vista.espacioVisual();                                                                      //
        Vista.mostrarLinea(" <> = = = = = = = = = = = =  POKEMONES  = = = = = = = = = = = = <>");

        for (int i = 0; i < listaPokemonesPokeMondonGo.size(); i++) {

            Pokemon pokemon = listaPokemonesPokeMondonGo.get(i);

            Vista.mostrarLinea("    [" + (i + 1) + "] " + pokemon.getNombre() +
                                        "     Salud: " + pokemon.getSalud() +
                                        "     Ataque: " + pokemon.getPuntosDeAtaque() +
                                        "     Tipo: " + pokemon.getTipo());

        }// for

        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = = = <>\n");

    }// mostrarPokemonesDisponibles

}// class
