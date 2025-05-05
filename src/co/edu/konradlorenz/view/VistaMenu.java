package co.edu.konradlorenz.view;

public class VistaMenu {
    
    public static void menuPrincipal(){// MENU PRINCIPAL
        Vista.espacioVisual();//TODO: Poner todas las opciones acorde al controller
        Vista.mostrarLinea(
                        "       ,___          .-;'   "+  "|  | » » » » » » »  MENÚ  PRINCIPAL  « « « « « « « |  |   ';-.          ___,\n" + //
                        "       `\"-.`\\_...._/`.`     "+"|  |                                               |  |    `.`\\_...._/`.-\"`\n" + //
                        "    ,      \\        /       "+ "|  |  [1] | Iniciar Batalla Pokémon.               |  |      \\        /      ,\n" + //
                        " .-' ',    / ()   ()\\       "+ "|  |                                               |  |      /()   () \\    .' `-.\n" + //
                        "`'._   \\  /()   .   (|      "+ "|  |  [2] | Menu Entrenadores.                     |  |     |)   .   ()\\  /   _.'`\n" + //
                        "    > .' ;,    -'-  /       "+  "|  |                                               |  |      \\  -'-    ,; '. <\n" + //
                        "   / <   |;,     __.;       "+  "|  |  [3] | Menu PokémonCenter.                    |  |      ;.__     ,;|   > \\\n" + //
                        "   '-.'-.|  , \\    , \\      "+"|  |                                               |  |     / ,    / ,  |.-'.-'\n" + //
                        "      `>.|;, \\_)    \\_)     "+"|  |  [4] | Menu PokémonStore.                     |  |    (_/    (_/ ,;|.<'\n" + //
                        "       `-;     ,    /       "+  "|  |                                               |  |       \\    ,     ;-'\n" + //
                        "          \\    /   <        "+ "|  |  [0] | Salir.                                 |  |        >   \\    /\n" + //
                        "           '. <`'-._)       "+  "|  |                                               |  |       (_,-'`> .'\n" + //
                        "            '._)            "+  "|  | » » » » » » »  PokeMondongo V3  « « « « « « « |  |           (_,'\n" + //
                        "");
    }//menuPrincipal

    public static void menuBatallaPokemon(){// OPCION 1
        Vista.espacioVisual();
        Vista.mostrarLinea(
                        "       ,___          .-;'   "+  "|  | » » » » » » »  BATALLA POKEMON  « « « « « « « |  |   ';-.          ___,\n" + //
                        "       `\"-.`\\_...._/`.`     "+"|  |                                               |  |    `.`\\_...._/`.-\"`\n" + //
                        "    ,      \\        /       "+ "|  |                                               |  |      \\        /      ,\n" + //
                        " .-' ',    / ()   ()\\       "+ "|  |  [1] | Elegir entrenador #1.                  |  |      /()   () \\    .' `-.\n" + //
                        "`'._   \\  /()   .   (|      "+ "|  |  [2] | Elegir entrenador #2.                  |  |     |)   .   ()\\  /   _.'`\n" + //
                        "    > .' ;,    -'-  /       "+  "|  |  [3] | Seleccionar pokémon del entrenador #1. |  |      \\  -'-    ,; '. <\n" + //
                        "   / <   |;,     __.;       "+  "|  |  [4] | Seleccionar pokémon del entrenador #2. |  |      ;.__     ,;|   > \\\n" + //
                        "   '-.'-.|  , \\    , \\      "+"|  |  [5] | Comenzar batalla.                      |  |     / ,    / ,  |.-'.-'\n" + //
                        "      `>.|;, \\_)    \\_)     "+"|  |                                               |  |    (_/    (_/ ,;|.<'\n" + //
                        "       `-;     ,    /       "+  "|  |  [9] | Volver al menú principal.              |  |       \\    ,     ;-'\n" + //
                        "          \\    /   <        "+ "|  |                                               |  |        >   \\    /\n" + //
                        "           '. <`'-._)       "+  "|  |                                               |  |       (_,-'`> .'\n" + //
                        "            '._)            "+  "|  | » » » » » » »  PokeMondongo V3  « « « « « « « |  |           (_,'\n" + //
                        "");
    }//menuBatallaPokemon
    
    public static void menuEntrenadores(){// OPCION 2
        Vista.espacioVisual();
        Vista.mostrarLinea(
                        "       ,___          .-;'   "+  "|  | » » » » » » » MENÚ ENTRENADORES « « « « « « « |  |   ';-.          ___,\n" + //
                        "       `\"-.`\\_...._/`.`     "+"|  |                                               |  |    `.`\\_...._/`.-\"`\n" + //
                        "    ,      \\        /       "+ "|  |                                               |  |      \\        /      ,\n" + //
                        " .-' ',    / ()   ()\\       "+ "|  |  [1] | Registrar Nuevo Entrenador.            |  |      /()   () \\    .' `-.\n" + //
                        "`'._   \\  /()   .   (|      "+ "|  |                                               |  |     |)   .   ()\\  /   _.'`\n" + //
                        "    > .' ;,    -'-  /       "+  "|  |  [2] | Ver Lista de Entrenadores.             |  |      \\  -'-    ,; '. <\n" + //
                        "   / <   |;,     __.;       "+  "|  |                                               |  |      ;.__     ,;|   > \\\n" + //
                        "   '-.'-.|  , \\    , \\      "+"|  |  [3] | Seleccionar un Entrenador.             |  |     / ,    / ,  |.-'.-'\n" + //
                        "      `>.|;, \\_)    \\_)     "+"|  |                                               |  |    (_/    (_/ ,;|.<'\n" + //
                        "       `-;     ,    /       "+  "|  |  [9] | Volver al menú principal.              |  |       \\    ,     ;-'\n" + //
                        "          \\    /   <        "+ "|  |                                               |  |        >   \\    /\n" + //
                        "           '. <`'-._)       "+  "|  |                                               |  |       (_,-'`> .'\n" + //
                        "            '._)            "+  "|  | » » » » » » »  PokeMondongo V3  « « « « « « « |  |           (_,'\n" + //
                        "");
    }//menuEntrenadores

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

    public static void menuPokemonCenter(){// OPCION 3
        Vista.espacioVisual();
        Vista.mostrarLinea(
                        "       ,___          .-;'   "+  "|  | » » » » » »  MENÚ POKEMONCENTER  « « « « « «  |  |   ';-.          ___,\n" + //
                        "       `\"-.`\\_...._/`.`     "+"|  |                                               |  |    `.`\\_...._/`.-\"`\n" + //
                        "    ,      \\        /       "+ "|  |  [1] | Curar un Pokémon.                      |  |      \\        /      ,\n" + //
                        " .-' ',    / ()   ()\\       "+ "|  |                                               |  |      /()   () \\    .' `-.\n" + //
                        "`'._   \\  /()   .   (|      "+ "|  |  [2] | Entrenar un Pokémon.                   |  |     |)   .   ()\\  /   _.'`\n" + //
                        "    > .' ;,    -'-  /       "+  "|  |                                               |  |      \\  -'-    ,; '. <\n" + //
                        "   / <   |;,     __.;       "+  "|  |  [3] | Intercambiar un Pokémon.               |  |      ;.__     ,;|   > \\\n" + //
                        "   '-.'-.|  , \\    , \\      "+"|  |                                               |  |     / ,    / ,  |.-'.-'\n" + //
                        "      `>.|;, \\_)    \\_)     "+"|  |  [4] | Historial de batallas.                 |  |    (_/    (_/ ,;|.<'\n" + //
                        "       `-;     ,    /       "+  "|  |                                               |  |       \\    ,     ;-'\n" + //
                        "          \\    /   <        "+ "|  |  [9] | Volver al menú principal.              |  |        >   \\    /\n" + //
                        "           '. <`'-._)       "+  "|  |                                               |  |       (_,-'`> .'\n" + //
                        "            '._)            "+  "|  | » » » » » » »  PokeMondongo V3  « « « « « « « |  |           (_,'\n" + //
                        "");
    }//menuPokemonCenter

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
