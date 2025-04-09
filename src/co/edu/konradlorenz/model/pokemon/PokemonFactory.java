package co.edu.konradlorenz.model.pokemon;

import co.edu.konradlorenz.model.pokemones.*;
import java.util.EnumSet;
import java.util.LinkedList;

public class PokemonFactory {
    public static LinkedList<Pokemon> crearPokemonesIniciales() {
        LinkedList<Pokemon> pokemones = new LinkedList<>();
        pokemones.add(newArticuno());
        pokemones.add(newCaterpie());
        pokemones.add(newCharmander());
        pokemones.add(newDiglett());
        pokemones.add(newDrowzee());
        pokemones.add(newHitmonlee());
        pokemones.add(newJolteon());
        pokemones.add(newShellder());
        pokemones.add(newSnorlax());
        pokemones.add(newTentacool());
        return pokemones;
    }

    private static Pokemon newArticuno() {
        return new Articuno("Articuno", 90, 85, EnumSet.of(EnumTipoPokemon.HIELO, EnumTipoPokemon.VOLADOR));
    }

    private static Pokemon newCaterpie() {
        return new Caterpie("Caterpie", 45, 30, EnumSet.of(EnumTipoPokemon.HIELO, EnumTipoPokemon.BICHO));
    }

    private static Pokemon newCharmander() {
        return new Charmander("Charmander", 39, 52, EnumSet.of(EnumTipoPokemon.FUEGO));
    }

    private static Pokemon newDiglett() {
        return new Diglett("Diglett", 10, 55, EnumSet.of(EnumTipoPokemon.TIERRA));
    }

    private static Pokemon newDrowzee() {
        return new Drowzee("Drowzee", 60, 48, EnumSet.of(EnumTipoPokemon.PSIQUICO));
    }

    private static Pokemon newHitmonlee() {
        return new Hitmonlee("Hitmonlee", 50, 120, EnumSet.of(EnumTipoPokemon.LUCHA));
    }

    private static Pokemon newJolteon() {
        return new Jolteon("Jolteon", 65, 65, EnumSet.of(EnumTipoPokemon.ELECTRICO));
    }

    private static Pokemon newShellder() {
        return new Shellder("Shellder", 30, 65, EnumSet.of(EnumTipoPokemon.AGUA));
    }

    private static Pokemon newSnorlax() {
        return new Snorlax("Snorlax", 160, 110, EnumSet.of(EnumTipoPokemon.NORMAL));
    }

    private static Pokemon newTentacool() {
        return new Tentacool("Tentacool", 90, 85, EnumSet.of(EnumTipoPokemon.AGUA, EnumTipoPokemon.VENENO));
    }
}