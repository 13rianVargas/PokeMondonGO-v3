package co.edu.konradlorenz.view;

public class VistaBatalla {

    public static void mostrarInicioBatalla(String nombrePokemon1, String nombrePokemon2) {

        Vista.mostrarMensaje(" <> = = = = = = ⚔︎ ⚔︎ ⚔︎ ¡BATALLA POKÉMON! ⚔︎ ⚔︎ ⚔︎ = = = = = = <>\n" +
                "    [ " + nombrePokemon1 + " ] VS [ " + nombrePokemon2 + " ]\n" +
                " <> = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");

    }// mostrarInicioBatalla

    public static void mostrarEstadoBatalla(String nombrePokemon1, String nombrePokemon2, double saludPokemon1,
            double saludPokemon2) {

        Vista.mostrarMensaje(" <> = = = = = = ⚔︎ ⚔︎ ⚔︎ ¡BATALLA POKÉMON! ⚔︎ ⚔︎ ⚔︎ = = = = = = <>\n\n" +
                "    [ " + nombrePokemon1 + " ]  Salud » " + String.format("%.1f", saludPokemon1) + " «\n" +
                "    [ " + nombrePokemon2 + " ]  Salud » " + String.format("%.1f", saludPokemon2) + " «\n\n" +
                " <> = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");

    }// mostrarEstadoBatalla

    public static void mostrarMensaje(String mensaje){

        Vista.mostrarMensaje(" <> = = = = = = ⚔︎ ⚔︎ ⚔︎ ¡BATALLA POKÉMON! ⚔︎ ⚔︎ ⚔︎ = = = = = = <>\n\n" +
                "    [  "+ mensaje +" ]\n\n" +
                " <> = = = = = = = = = = = = = = = = = = = = = = = = = = = <>");

    }// mostrarTurno

    public static void menuTipoDeAtaque(){

        Vista.espacioVisual();
        Vista.mostrarLinea(
                        "       ,___          .-;'   "+  "|  | ⚔︎ ⚔︎ ⚔︎ ⚔︎ ¡BATALLA  POKÉMON! ⚔︎ ⚔︎ ⚔︎ ⚔︎ |  |   ';-.          ___,\n" + //
                        "       `\"-.`\\_...._/`.`     "+"|  |                                    |  |    `.`\\_...._/`.-\"`\n" + //
                        "    ,      \\        /       "+ "|  |                                    |  |      \\        /      ,\n" + //
                        " .-' ',    / ()   ()\\       "+ "|  |  [1] | Ataque Normal               |  |      /()   () \\    .' `-.\n" + //
                        "`'._   \\  /()   .   (|      "+ "|  |                                    |  |     |)   .   ()\\  /   _.'`\n" + //
                        "    > .' ;,    -'-  /       "+  "|  |  [2] | Ataque Especial             |  |      \\  -'-    ,; '. <\n" + //
                        "   / <   |;,     __.;       "+  "|  |                                    |  |      ;.__     ,;|   > \\\n" + //
                        "   '-.'-.|  , \\    , \\      "+"|  |  [3] | Defenderse                  |  |     / ,    / ,  |.-'.-'\n" + //
                        "      `>.|;, \\_)    \\_)     "+"|  |                                    |  |    (_/    (_/ ,;|.<'\n" + //
                        "       `-;     ,    /       "+  "|  |  [0] | Huir                        |  |       \\    ,     ;-'\n" + //
                        "          \\    /   <        "+ "|  |                                    |  |        >   \\    /\n" + //
                        "           '. <`'-._)       "+  "|  |                                    |  |       (_,-'`> .'\n" + //
                        "            '._)            "+  "|  | ⚔︎ ⚔︎ ⚔︎   » PokeMondongo V3 «  ⚔︎ ⚔︎ ⚔︎ |  |           (_,'\n" + //
                        "");
    }//menuPrincipal

}// class
