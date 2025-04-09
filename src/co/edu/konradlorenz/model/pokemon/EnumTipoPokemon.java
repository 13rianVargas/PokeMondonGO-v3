package co.edu.konradlorenz.model.pokemon;

import java.util.EnumSet;

public enum EnumTipoPokemon {
    FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA; 

    //Complejidad temporal: O(n) Tiempo lineal
    public static double obtenerMultiplicadorDeDaño(EnumTipoPokemon atacante, EnumSet<EnumTipoPokemon> defensores) {
        double multiplicador = 1.0;
    
        for (EnumTipoPokemon defensor : defensores) {
            multiplicador *= obtenerMultiplicadorDeDañoIndividual(atacante, defensor);
        }

        return multiplicador;
    }//obtenerMultiplicadorDeDaño

    //Complejidad temporal: O(1) Tiempo constante
    public static double obtenerMultiplicadorDeDañoIndividual(EnumTipoPokemon atacante, EnumTipoPokemon defensor) {
        switch (atacante) {

            case FUEGO -> {
                if (defensor == PLANTA || defensor == BICHO || defensor == HIELO) return 2.0;
                if (defensor == AGUA || defensor == FUEGO || defensor == ROCA) return 0.5;
            }

            case AGUA -> {
                if (defensor == FUEGO || defensor == ROCA || defensor == TIERRA) return 2.0;
                if (defensor == AGUA || defensor == PLANTA ) return 0.5;
            }

            case ELECTRICO -> {
                if (defensor == AGUA || defensor == VOLADOR) return 2.0;
                if (defensor == ELECTRICO || defensor == PLANTA ) return 0.5;
                if (defensor == TIERRA) return 0.0;
            }

            case PLANTA -> {
                if (defensor == AGUA || defensor == ROCA || defensor == TIERRA) return 2.0;
                if (defensor == FUEGO || defensor == PLANTA || defensor == VENENO || defensor == VOLADOR || defensor == BICHO) return 0.5;
            }

            case HIELO -> {
                if (defensor == PLANTA || defensor == VOLADOR || defensor == TIERRA ) return 2.0;
                if (defensor == FUEGO || defensor == AGUA || defensor == HIELO || defensor == ACERO) return 0.5;
            }

            case LUCHA -> {
                if (defensor == NORMAL || defensor == HIELO || defensor == ROCA || defensor == ACERO) return 2.0;
                if (defensor == VENENO || defensor == VOLADOR || defensor == PSIQUICO || defensor == BICHO || defensor == HADA) return 0.5;
                if (defensor == FANTASMA) return 0.0;
            }

            default -> {
                return 1.0;
            }
        }//switch
        return 1.0;
    }//obtenerMultiplicadorDeDañoIndividual
}//class