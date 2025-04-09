package co.edu.konradlorenz.model.entrenador;

import co.edu.konradlorenz.controller.Controlador;
import co.edu.konradlorenz.model.pokemon.EnumEstado;
import co.edu.konradlorenz.model.pokemon.Pokemon;
import co.edu.konradlorenz.view.Vista;
import java.io.Serializable;
import java.util.LinkedList;

public class Entrenador implements Serializable {
    private String nombre;
    private LinkedList<Pokemon> pokeLista;

    Controlador ctrl = new Controlador();

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

    //Complejidad temporal: O(1) Tiempo constante
    public void agregarPokemon(Pokemon pokemon) {
        try {
            if (pokemon == null) {
                Vista.mostrarMensaje("Error: No se puede agregar un Pokémon nulo");
                return;
            }
            if (pokeLista == null) {
                pokeLista = new LinkedList<>();
            }
            pokeLista.add(pokemon);
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al agregar Pokémon: " + e.getMessage());
        }
    }//agregarPokemon

    //Complejidad temporal: O(1) Tiempo constante
    public void entrenarPokemon(Pokemon pokemon) {
        try {
            if (pokemon == null) {
                Vista.mostrarMensaje("Error: No se puede entrenar un Pokémon nulo");
                return;
            }
            pokemon.entrenar();
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al entrenar Pokémon: " + e.getMessage());
        }
    }//entrenarPokemon

    //Complejidad temporal: O(n) Complejidad lineal
    public void mostrarPokemones() {
        try {
            if (pokeLista == null || pokeLista.isEmpty()) {
                Vista.mostrarMensaje(" <> ¡ Oh oh, no tienes pokemones ! <> ");
                ctrl.wait(ctrl.sg);
                return;
            }

            Vista.mostrarMensaje("Cargando lista de pokemones...");
            ctrl.wait(ctrl.sg);

            Vista.espacioVisual();
            Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");
            for (Pokemon pokemon : pokeLista) {
                if (pokemon != null) {
                    Vista.mostrarLinea("    [" + (pokeLista.indexOf(pokemon) + 1) + "]  " + 
                                     pokemon.getNombre() + "     Salud -> " + 
                                     pokemon.getSalud() + "     Ataque -> " + 
                                     pokemon.getPuntosDeAtaque() + "     Tipo -> " + 
                                     pokemon.getTipo() + "     Estado -> " + 
                                     pokemon.getEstado());
                }
            }
            Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = <>\n\n");
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al mostrar Pokémon: " + e.getMessage());
        }
    }//mostrarPokemones

    //Complejidad temporal: O(log n) Tiempo logarítmico
    public Pokemon prepararBatalla() {
        try {
            if (pokeLista == null || pokeLista.isEmpty()) {
                Vista.mostrarMensaje("No hay Pokémon disponibles para la batalla");
                return null;
            }

            mostrarPokemones();
            
            try {
                int seleccion = Integer.parseInt(Vista.pedirString("Elige el pokémon para la batalla")) - 1;
                
                if (seleccion >= 0 && seleccion < pokeLista.size()) {
                    Pokemon pokemonBatalla = pokeLista.get(seleccion);
                    if (pokemonBatalla.getEstado() == EnumEstado.DEBILITADO) {
                        Vista.mostrarMensaje("Este Pokémon está debilitado y no puede batallar");
                        return null;
                    }
                    return pokemonBatalla;
                } else {
                    Vista.mostrarMensaje("Selección inválida");
                    return null;
                }
            } catch (NumberFormatException e) {
                Vista.mostrarMensaje("Error: Entrada numérica inválida");
                return null;
            }
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al preparar batalla: " + e.getMessage());
            return null;
        }
    }//prepararBatalla

}//class
