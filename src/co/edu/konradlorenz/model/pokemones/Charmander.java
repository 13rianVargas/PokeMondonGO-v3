package co.edu.konradlorenz.model.pokemones;

import co.edu.konradlorenz.model.pokemon.Pokemon;
import co.edu.konradlorenz.model.pokemon.EnumTipoPokemon;
import java.util.EnumSet;

public class Charmander extends Pokemon{

    public Charmander(String nombre, double salud, double puntosDeAtaque, EnumSet<EnumTipoPokemon> tipo) {
        super(nombre, salud, puntosDeAtaque, tipo);
    }
}