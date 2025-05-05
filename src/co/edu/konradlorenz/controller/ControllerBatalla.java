package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.pokemon.*;
import co.edu.konradlorenz.model.entrenador.*;
import co.edu.konradlorenz.view.*;

class ControllerBatalla {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public void runBatallaPokemon() {

        boolean run = true; // Variable de control del menú
        do {
            VistaMenu.menuBatallaPokemon();

            int opcion;

            try {
                opcion = Integer.parseInt(Vista.pedirDato("Selecciona una opción"));
            } catch (NumberFormatException e) {
                Vista.mostrarMensaje("Por favor ingrese un número válido");
                continue; // Retorna al inicio del do-while
            } catch (Exception e) {
                Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
                continue; // Retorna al inicio del do-while
            }

            switch (opcion) {
                case 1: // Elegir entrenador 1

                    try {
                        entrenador1 = seleccionarEntrenador();

                        if (entrenador1.getPokeLista().isEmpty()) {
                            Vista.mostrarMensaje("Entrenador sin Pokémon, por favor seleccione otro entrenador.");
                            entrenador1 = null;
                            break;
                        }

                    } catch (NullPointerException e) {
                        Vista.mostrarMensaje("Selección inválida (null), por favor seleccione nuevamente.");
                        break;
                    } catch (Exception e) {
                        Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
                        break;
                    } // try-catch

                    break;
                case 2: // Elegir entrenador 2

                    try {
                        entrenador2 = seleccionarEntrenador();

                        if (entrenador2.getPokeLista().isEmpty()) {
                            Vista.mostrarMensaje("Entrenador sin Pokémon, por favor seleccione otro entrenador.");
                            entrenador2 = null;
                            break;
                        }

                    } catch (NullPointerException e) {
                        Vista.mostrarMensaje("Selección (null), por favor seleccione nuevamente.");
                        break;
                    } catch (Exception e) {
                        Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
                        break;
                    } // try-catch

                    break;
                case 3: // Elegir pokemon 1, entrenador 1

                    if (entrenador1 == null) {
                        Vista.mostrarMensaje("Por favor seleccione el entrenador 1 primero");
                        break;
                    }
                    try {
                        pokemon1 = seleccionarPokemon(entrenador1);
                        if (pokemon1 == null) {
                            Vista.mostrarMensaje("Pokémon no seleccionado, por favor seleccione un Pokémon.");
                            break;
                        }
                    } catch (NullPointerException e) {
                        Vista.mostrarMensaje("Selección (null), por favor seleccione nuevamente.");
                    } catch (Exception e) {
                        Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
                        break;
                    } // try-catch

                    break;
                case 4: // Elegir pokemon 2, entrenador 2

                    if (entrenador2 == null) {
                        Vista.mostrarMensaje("Por favor seleccione el entrenador 2 primero");
                        break;
                    }

                    try {
                        pokemon2 = seleccionarPokemon(entrenador2);
                        if (pokemon2 == null) {
                            Vista.mostrarMensaje("Pokémon no seleccionado, por favor seleccione un Pokémon.");
                            break;
                        }
                    } catch (NullPointerException e) {
                        Vista.mostrarMensaje("Selección (null), por favor seleccione nuevamente.");
                    } catch (Exception e) {
                        Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
                        break;
                    } // try-catch

                    break;
                case 5: // Comenzar batalla

                    if (entrenador1 == null) {
                        Vista.mostrarMensaje("Por favor seleccione el entrenador 1 primero");
                        break;
                    }
                    if (entrenador2 == null) {
                        Vista.mostrarMensaje("Por favor seleccione el entrenador 2 primero");
                        break;
                    }
                    if (pokemon1 == null) {
                        Vista.mostrarMensaje("Por favor seleccione el Pokémon del entrenador 1 primero");
                        break;
                    }
                    if (pokemon2 == null) {
                        Vista.mostrarMensaje("Por favor seleccione el Pokémon del entrenador 2 primero");
                        break;
                    }

                    VistaBatalla.mostrarInicioBatalla(pokemon1.getNombre(), pokemon2.getNombre());
                    comenzarBatalla();

                    break;
                case 9: // Volvel al menú principal
                    Vista.mostrarMensaje("Regresando al menú principal...");
                    run = false;
                    break;
                default:
                    Vista.mostrarMensaje("Opción no válida");
                    break;
            }// switch

        } while (run);

    }// runBatallaPokemon

    private Entrenador seleccionarEntrenador() {

        ControllerEntrenador.seleccionarEntrenadores();

        try {
            int seleccion = Integer.parseInt(Vista.pedirDato("Selecciona el entrenador")) - 1;
            if (seleccion >= 0 && seleccion < ControllerEntrenador.listaEntrenadoresPokeMondonGo.size()) {
                return ControllerEntrenador.listaEntrenadoresPokeMondonGo.get(seleccion);
            } else {
                Vista.mostrarMensaje("Selección inválida");
                return null;
            }
        } catch (Exception e) {
            Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
        } // try-catch

        return null;

    }// seleccionarEntrenador

    private Pokemon seleccionarPokemon(Entrenador entrenador) {

        entrenador.mostrarPokemones();

        try {
            int seleccion = Integer.parseInt(Vista.pedirDato("Selecciona el Pokémon")) - 1;
            if (seleccion >= 0 && seleccion < entrenador.getPokeLista().size()) {
                Pokemon pokemon = entrenador.getPokeLista().get(seleccion);
                if (pokemon.getEstado() == EnumEstado.DEBILITADO) {
                    Vista.mostrarMensaje("Este Pokémon está debilitado y no puede batallar, debe seleccionar otro");
                    return null;
                }
                return pokemon;
            } else {
                Vista.mostrarMensaje("Selección inválida");
                return null;
            }
        } catch (Exception e) {
            Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
        } // try-catch

        return null;

    }// seleccionarPokemon

    private void comenzarBatalla() {
        boolean runBatalla = true;
        Pokemon atacante, defensor;

        // Selección aleatoria del primer turno
        if (Math.random() < 0.5) {
            atacante = pokemon1;
            defensor = pokemon2;
        } else {
            atacante = pokemon2;
            defensor = pokemon1;
        }

        do {
            VistaBatalla.mostrarEstadoBatalla(pokemon1.getNombre(), pokemon2.getNombre(), pokemon1.getSalud(),
                    pokemon2.getSalud());

            VistaBatalla.mostrarMensaje("TURNO DE -> " + atacante.getNombre());
            VistaBatalla.menuTipoDeAtaque();

            int opcion;

            try {

                opcion = Controller.seleccionarOpcion();

            } catch (NumberFormatException e) {
                Vista.mostrarMensaje("Por favor ingrese un número válido");
                continue; // Retorna al inicio del do-while
            } catch (Exception e) {
                Vista.mostrarMensaje("Error inesperado: " + e.getMessage());
                e.printStackTrace();
                continue; // Retorna al inicio del do-while
            } // try-catch

            String tipoAtaque = "";

            switch (opcion) {
                case 1: // Ataque Normal

                    double daño = atacante.ataqueNormal(defensor);

                    tipoAtaque = "Ataque Normal";

                    defensor.recibirDaño(daño);

                    VistaBatalla.mostrarMensaje(atacante.getNombre() + " usó " + tipoAtaque + " y causó "
                            + String.format("%.1f", daño) + " de daño a " + defensor.getNombre() + "!");

                    break;
                case 2: // Ataque Especial //TODO: Implementar ataque especial
                    Vista.mostrarMensaje("Esta opción aún no está implementada");
                    // atacante.ataqueEspecial(defensor);
                    tipoAtaque = "Ataque Especial";
                    break;
                case 3: // Defender //TODO: Implementar defensa
                    Vista.mostrarMensaje("Esta opción aún no está implementada");
                    // atacante.defenderse();
                    tipoAtaque = "Defensa";
                    break;
                case 0: // Huir
                    Vista.mostrarMensaje(atacante.getNombre() + " huyó de la batalla!");
                    runBatalla = false;
                    break;
                default:
                    Vista.mostrarMensaje("Opción no válida");
                    break;
            }

            if (verificarFinBatalla()) {
                Pokemon ganador = pokemon1.getEstado() != EnumEstado.DEBILITADO ? pokemon1 : pokemon2;
                //TODO: mensaje de DEBILITADO
                VistaBatalla.mostrarMensaje(ganador.getNombre() + " es el ganador!");
                //TODO: Si alguien huye no mostrar mensaje de ganador

                // Actualizar el estado de los Pokémon
                if (pokemon1.getEstado() == EnumEstado.DEBILITADO) {
                    pokemon1.setEstado(EnumEstado.DEBILITADO);
                }
                if (pokemon2.getEstado() == EnumEstado.DEBILITADO) {
                    pokemon2.setEstado(EnumEstado.DEBILITADO);
                }

                runBatalla = false;
            } else {
                // Intercambiar roles para el siguiente turno
                Pokemon temp = atacante;
                atacante = defensor;
                defensor = temp;
            }

        } while (runBatalla);

    }// comenzarBatalla

    private boolean verificarFinBatalla() {
        return pokemon1.getEstado() == EnumEstado.DEBILITADO || pokemon2.getEstado() == EnumEstado.DEBILITADO;
    }// verificarFinBatalla

}// class
