package co.edu.konradlorenz.view;

public class VistaMenu {
    
    public static void menuPrincipal(){// MENU PRINCIPAL
        Vista.espacioVisual();//TODO: Poner todas las opciones acorde al controller
        Vista.mostrarLinea(
            "       ,___          .-;'   "+  "|  | » » »     MENÚ PRINCIPAL     « « « |  |   ';-.          ___,\n" + //
            "       `\"-.`\\_...._/`.`     "+"|  |                                    |  |    `.`\\_...._/`.-\"`\n" + //
            "    ,      \\        /       "+ "|  |                                    |  |      \\        /      ,\n" + //
            " .-' ',    / ()   ()\\       "+ "|  |  [1] | Batalla Pokémon             |  |      /()   () \\    .' `-.\n" + //
            "`'._   \\  /()   .   (|      "+ "|  |                                    |  |     |)   .   ()\\  /   _.'`\n" + //
            "    > .' ;,    -'-  /       "+  "|  |  [2] | Crear entrenador           |  |      \\  -'-    ,; '. <\n" + //
            "   / <   |;,     __.;       "+  "|  |                                    |  |      ;.__     ,;|   > \\\n" + //
            "   '-.'-.|  , \\    , \\      "+"|  |  [3] | Ver entrenadores            |  |     / ,    / ,  |.-'.-'\n" + //
            "      `>.|;, \\_)    \\_)     "+"|  |                                    |  |    (_/    (_/ ,;|.<'\n" + //
            "       `-;     ,    /       "+  "|  |  [0] | Salir                      |  |       \\    ,     ;-'\n" + //
            "          \\    /   <        "+ "|  |                                    |  |        >   \\    /\n" + //
            "           '. <`'-._)       "+  "|  |                                    |  |       (_,-'`> .'\n" + //
            "            '._)            "+  "|  | » » »      PokeChangua       « « « |  |           (_,'\n" + //
            "");
    }//menuPrincipal

    public static void menuBatallaPokemon(){// OPCION 1
        Vista.espacioVisual();
        Vista.mostrarLinea(
                        "       ,___          .-;'   "+  "|  | » » »    INICIAR  BATALLA    « « « |  |   ';-.          ___,\n" + //
                        "       `\"-.`\\_...._/`.`     "+"|  |                                    |  |    `.`\\_...._/`.-\"`\n" + //
                        "    ,      \\        /       "+ "|  |  [1] | Elegir entrenador #1.       |  |      \\        /      ,\n" + //
                        " .-' ',    / ()   ()\\       "+ "|  |  [2] | Elegir entrenador #2.       |  |      /()   () \\    .' `-.\n" + //
                        "`'._   \\  /()   .   (|      "+ "|  |  [3] | Seleccionar pokémon         |  |     |)   .   ()\\  /   _.'`\n" + //
                        "    > .' ;,    -'-  /       "+  "|  |           del entrenador#1.        |  |      \\  -'-    ,; '. <\n" + //
                        "   / <   |;,     __.;       "+  "|  |  [4] | Seleccionar pokémon         |  |      ;.__     ,;|   > \\\n" + //
                        "   '-.'-.|  , \\    , \\      "+"|  |           del entrenador#2.        |  |     / ,    / ,  |.-'.-'\n" + //
                        "      `>.|;, \\_)    \\_)     "+"|  |  [5] | Comenzar batalla.           |  |    (_/    (_/ ,;|.<'\n" + //
                        "       `-;     ,    /       "+  "|  |  [9] | Volver al menú principal.   |  |       \\    ,     ;-'\n" + //
                        "          \\    /   <        "+ "|  |  [0] | Salir.                      |  |        >   \\    /\n" + //
                        "           '. <`'-._)       "+  "|  |                                    |  |       (_,-'`> .'\n" + //
                        "            '._)            "+  "|  | » » »      PokeChangua       « « « |  |           (_,'\n" + //
                        "");
    }//menuBatallaPokemon
    
    public static void menuGestionarEntrenadores(){//1
        Vista.espacioVisual();
        Vista.mostrarLinea(
                        "       ,___          .-;'   "+  "|  | » » » GESTIONAR ENTRENADORES « « « |  |   ';-.          ___,\n" + //
                        "       `\"-.`\\_...._/`.`     "+"|  |                                    |  |    `.`\\_...._/`.-\"`\n" + //
                        "    ,      \\        /       "+ "|  |  [1] | Registrar nuevo entrenador. |  |      \\        /      ,\n" + //
                        " .-' ',    / ()   ()\\       "+ "|  |                                    |  |      /()   () \\    .' `-.\n" + //
                        "`'._   \\  /()   .   (|      "+ "|  |  [2] | Ver lista de entrenadores.  |  |     |)   .   ()\\  /   _.'`\n" + //
                        "    > .' ;,    -'-  /       "+  "|  |                                    |  |      \\  -'-    ,; '. <\n" + //
                        "   / <   |;,     __.;       "+  "|  |  [3] | Seleccionar un entrenador.  |  |      ;.__     ,;|   > \\\n" + //
                        "   '-.'-.|  , \\    , \\      "+"|  |                                    |  |     / ,    / ,  |.-'.-'\n" + //
                        "      `>.|;, \\_)    \\_)     "+"|  |  [9] | Volver al menú principal.   |  |    (_/    (_/ ,;|.<'\n" + //
                        "       `-;     ,    /       "+  "|  |                                    |  |       \\    ,     ;-'\n" + //
                        "          \\    /   <        "+ "|  |  [0] | Salir.                      |  |        >   \\    /\n" + //
                        "           '. <`'-._)       "+  "|  |                                    |  |       (_,-'`> .'\n" + //
                        "            '._)            "+  "|  | » » »      PokeChangua       « « « |  |           (_,'\n" + //
                        "");
    }//menuGestionarEntrenadores

    public static void menuOpcionesEntrenador(){// OPCION 2.3
        Vista.espacioVisual();
        Vista.mostrarLinea(
                        "       ,___          .-;'   "+  "|  | » » » » » »  OPCIONES ENTRENADOR  « « « « « « |  |   ';-.          ___,\n" + //
                        "       `\"-.`\\_...._/`.`     "+"|  |                                               |  |    `.`\\_...._/`.-\"`\n" + //
                        "    ,      \\        /       "+ "|  |  [1] | Ver equipo de pokemones.               |  |      \\        /      ,\n" + //
                        " .-' ',    / ()   ()\\       "+ "|  |                                               |  |      /()   () \\    .' `-.\n" + //
                        "`'._   \\  /()   .   (|      "+ "|  |  [2] | Seleccionar pokémon.                   |  |     |)   .   ()\\  /   _.'`\n" + //
                        "    > .' ;,    -'-  /       "+  "|  |                                               |  |      \\  -'-    ,; '. <\n" + //
                        "   / <   |;,     __.;       "+  "|  |  [3] | Modificar entrenador.                  |  |      ;.__     ,;|   > \\\n" + //
                        "   '-.'-.|  , \\    , \\      "+"|  |                                               |  |     / ,    / ,  |.-'.-'\n" + //
                        "      `>.|;, \\_)    \\_)     "+"|  |  [4] | Eliminar entrenador.                   |  |    (_/    (_/ ,;|.<'\n" + //
                        "       `-;     ,    /       "+  "|  |                                               |  |       \\    ,     ;-'\n" + //
                        "          \\    /   <        "+ "|  |  [9] | Volver al menu anterior.               |  |        >   \\    /\n" + //
                        "           '. <`'-._)       "+  "|  |                                               |  |       (_,-'`> .'\n" + //
                        "            '._)            "+  "|  | » » » » » » »  PokeMondongo V3  « « « « « « « |  |           (_,'\n" + //
                        "");
    }//menuOpcionesEntrenador   

    public static void menuGestionarPokemones(){// OPCION 3
        Vista.espacioVisual();
        Vista.mostrarLinea(
            "       ,___          .-;'   "+  "|  | » » »  GESTIONAR  POKEMONES  « « « |  |   ';-.          ___,\n" + //
            "       `\"-.`\\_...._/`.`     "+"|  |                                    |  |    `.`\\_...._/`.-\"`\n" + //
            "    ,      \\        /       "+ "|  |                                    |  |      \\        /      ,\n" + //
            " .-' ',    / ()   ()\\       "+ "|  |  [1] | Ver pokemones registrados.  |  |      /()   () \\    .' `-.\n" + //
            "`'._   \\  /()   .   (|      "+ "|  |                                    |  |     |)   .   ()\\  /   _.'`\n" + //
            "    > .' ;,    -'-  /       "+  "|  |  [2] | Registrar nuevo pokémon.    |  |      \\  -'-    ,; '. <\n" + //
            "   / <   |;,     __.;       "+  "|  |                                    |  |      ;.__     ,;|   > \\\n" + //
            "   '-.'-.|  , \\    , \\      "+"|  |  [9] | Volver al menú principal.   |  |     / ,    / ,  |.-'.-'\n" + //
            "      `>.|;, \\_)    \\_)     "+"|  |                                    |  |    (_/    (_/ ,;|.<'\n" + //
            "       `-;     ,    /       "+  "|  |  [0] | Salir.                      |  |       \\    ,     ;-'\n" + //
            "          \\    /   <        "+ "|  |                                    |  |        >   \\    /\n" + //
            "           '. <`'-._)       "+  "|  |                                    |  |       (_,-'`> .'\n" + //
            "            '._)            "+  "|  | » » »      PokeChangua       « « « |  |           (_,'\n" + //
            "");
    }//menuGestionarPokemones

    public static void menuMisPokemon(){// OPCION 4
        Vista.espacioVisual();
        Vista.mostrarLinea(
                        "       ,___          .-;'   "+  "|  | » » » » » » » » MIS  POKÉMON « « « « « « « «  |  |   ';-.          ___,\n" + //
                        "       `\"-.`\\_...._/`.`     "+"|  |                                               |  |    `.`\\_...._/`.-\"`\n" + //
                        "    ,      \\        /       "+ "|  |  [1] | Ver pokemones de PokemondonGO.         |  |      \\        /      ,\n" + //
                        " .-' ',    / ()   ()\\       "+ "|  |                                               |  |      /()   () \\    .' `-.\n" + //
                        "`'._   \\  /()   .   (|      "+ "|  |  [2] | Comprar pokémon para mi equipo.        |  |     |)   .   ()\\  /   _.'`\n" + //
                        "    > .' ;,    -'-  /       "+  "|  |                                               |  |      \\  -'-    ,; '. <\n" + //
                        "   / <   |;,     __.;       "+  "|  |  [3] | Mis Pokémon.                           |  |      ;.__     ,;|   > \\\n" + //
                        "   '-.'-.|  , \\    , \\      "+"|  |                                               |  |     / ,    / ,  |.-'.-'\n" + //
                        "      `>.|;, \\_)    \\_)     "+"|  |  [4] | Historial de batallas.                 |  |    (_/    (_/ ,;|.<'\n" + //
                        "       `-;     ,    /       "+  "|  |                                               |  |       \\    ,     ;-'\n" + //
                        "          \\    /   <        "+ "|  |  [9] | Volver al menú principal.              |  |        >   \\    /\n" + //
                        "           '. <`'-._)       "+  "|  |                                               |  |       (_,-'`> .'\n" + //
                        "            '._)            "+  "|  | » » » » » » »  PokeMondongo V3  « « « « « « « |  |           (_,'\n" + //
                        "");
    }//menuPokemonCenter
    
}//class
