package co.edu.konradlorenz.controller.batalla;

import co.edu.konradlorenz.model.pokemon.Pokemon;
import co.edu.konradlorenz.model.pokemon.EnumEstado;
import co.edu.konradlorenz.model.entrenador.Entrenador;
import co.edu.konradlorenz.view.Vista;
import java.util.LinkedList;

public class Batalla {
    private final LinkedList<Entrenador> entrenadores;
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public Batalla(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public void iniciarPreparacion() {
        Vista.menuIniciarBatalla();
        if (!seleccionarEntrenadores()) {
            return;
        }
        if (!seleccionarPokemones()) {
            return;
        }
        ejecutarBatalla();
    }

    private boolean seleccionarEntrenadores() {
        mostrarEntrenadores();
        try {
            int seleccion1 = Integer.parseInt(Vista.pedirString("Selecciona el entrenador 1")) - 1;
            if (!validarSeleccionEntrenador(seleccion1)) return false;
            entrenador1 = entrenadores.get(seleccion1);

            mostrarEntrenadores();
            int seleccion2 = Integer.parseInt(Vista.pedirString("Selecciona el entrenador 2")) - 1;
            if (!validarSeleccionEntrenador(seleccion2) || seleccion1 == seleccion2) {
                Vista.mostrarMensaje("Selección de entrenador inválida");
                return false;
            }
            entrenador2 = entrenadores.get(seleccion2);
            return true;
        } catch (NumberFormatException e) {
            Vista.mostrarMensaje("Entrada inválida");
            return false;
        }
    }

    private boolean seleccionarPokemones() {
        try {
            Vista.mostrarMensaje("Entrenador 1: " + entrenador1.getNombre() + ", selecciona tu Pokémon");
            pokemon1 = entrenador1.prepararBatalla();
            if (pokemon1 == null || pokemon1.getEstado() == EnumEstado.DEBILITADO) {
                Vista.mostrarMensaje("Pokémon no válido para batalla");
                return false;
            }

            Vista.mostrarMensaje("Entrenador 2: " + entrenador2.getNombre() + ", selecciona tu Pokémon");
            pokemon2 = entrenador2.prepararBatalla();
            if (pokemon2 == null || pokemon2.getEstado() == EnumEstado.DEBILITADO) {
                Vista.mostrarMensaje("Pokémon no válido para batalla");
                return false;
            }
            return true;
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al seleccionar Pokémon");
            return false;
        }
    }

    private void mostrarEntrenadores() {
        Vista.espacioVisual();
        Vista.mostrarLinea(" <> = = = = = = = = = = ENTRENADORES = = = = = = = = = = <>");
        for (int i = 0; i < entrenadores.size(); i++) {
            Vista.mostrarLinea("    [" + (i + 1) + "] " + entrenadores.get(i).getNombre());
        }
        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = <>\n");
    }

    private boolean validarSeleccionEntrenador(int seleccion) {
        return seleccion >= 0 && seleccion < entrenadores.size();
    }

    private void ejecutarBatalla() {
        mostrarInicioBatalla();
        
        boolean batallaContinua = true;
        int turno = 1;
        
        while (batallaContinua) {
            mostrarEstadoBatalla(turno);
            
            int accion = obtenerAccion();
            if (accion == 3) {
                Vista.mostrarMensaje("Batalla cancelada");
                return;
            }
            
            realizarTurno(accion);
            
            if (verificarFinBatalla()) {
                batallaContinua = false;
            }
            
            turno++;
        }
        
        mostrarResultadoBatalla();
    }

    private void mostrarInicioBatalla() {
        Vista.espacioVisual();
        Vista.mostrarLinea("⚔︎ ⚔︎ ⚔︎ ¡BATALLA POKÉMON! ⚔︎ ⚔︎ ⚔︎");
        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");
        Vista.mostrarLinea("    [ " + pokemon1.getNombre() + " ] VS [ " + pokemon2.getNombre() + " ]");
        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");
    }

    private void mostrarEstadoBatalla(int turno) {
        Vista.espacioVisual();
        Vista.mostrarLinea(" <> = = = = = = = = = = TURNO " + turno + " = = = = = = = = = = <>");
        Vista.mostrarLinea("    [ " + pokemon1.getNombre() + " ]  Salud: " + String.format("%.1f", pokemon1.getSalud()));
        Vista.mostrarLinea("    [ " + pokemon2.getNombre() + " ]  Salud: " + String.format("%.1f", pokemon2.getSalud()));
        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");
        Vista.mostrarLinea("    [1] " + pokemon1.getNombre() + " ataca");
        Vista.mostrarLinea("    [2] " + pokemon2.getNombre() + " ataca");
        Vista.mostrarLinea("    [3] Finalizar batalla");
        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");
    }

    private int obtenerAccion() {
        try {
            return Integer.parseInt(Vista.pedirString("Seleccione una acción"));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void realizarTurno(int accion) {
        switch (accion) {
            case 1 -> realizarAtaque(pokemon1, pokemon2);
            case 2 -> realizarAtaque(pokemon2, pokemon1);
            default -> Vista.mostrarMensaje("Acción inválida");
        }
    }

    private void realizarAtaque(Pokemon atacante, Pokemon defensor) {
        double daño = atacante.atacar(defensor);
        defensor.recibirDaño(daño);
        
        Vista.espacioVisual();
        Vista.mostrarLinea(" <> = = = = = = = = = = ATAQUE = = = = = = = = = = <>");
        Vista.mostrarLinea("    ¡" + atacante.getNombre() + " ataca a " + defensor.getNombre() + "!");
        Vista.mostrarLinea("    Daño causado: " + String.format("%.1f", daño));
        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");
    }

    private boolean verificarFinBatalla() {
        return pokemon1.getEstado() == EnumEstado.DEBILITADO || 
               pokemon2.getEstado() == EnumEstado.DEBILITADO;
    }

    private void mostrarResultadoBatalla() {
        Vista.espacioVisual();
        Vista.mostrarLinea(" <> = = = = = = = = = FIN DE BATALLA = = = = = = = = = <>");
        Vista.mostrarLinea("    Resultado final:");
        Vista.mostrarLinea("    " + pokemon1.getNombre() + " - Salud: " + String.format("%.1f", pokemon1.getSalud()));
        Vista.mostrarLinea("    " + pokemon2.getNombre() + " - Salud: " + String.format("%.1f", pokemon2.getSalud()));
        
        String ganador = pokemon1.getEstado() == EnumEstado.DEBILITADO ? pokemon2.getNombre() : pokemon1.getNombre();
        Vista.mostrarLinea("    ¡" + ganador + " es el ganador!");
        Vista.mostrarLinea(" <> = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");
    }
}
