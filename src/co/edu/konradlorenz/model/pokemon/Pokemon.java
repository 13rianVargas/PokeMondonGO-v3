package co.edu.konradlorenz.model.pokemon;

import java.io.Serializable;
import java.util.EnumSet;

import co.edu.konradlorenz.view.Vista;

public class Pokemon implements Serializable {
    protected String nombre;
    protected double salud;
    protected double puntosDeAtaque;
    protected EnumSet<EnumTipoPokemon> tipo;
    protected EnumEstado estado;

    public Pokemon(String nombre, double salud, double puntosDeAtaque, EnumSet<EnumTipoPokemon> tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = EnumEstado.NORMAL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(double puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public EnumSet<EnumTipoPokemon> getTipo() {
        return tipo;
    }

    public EnumEstado getEstado() {
        return estado;
    }

    //Complejidad temporal: O(1) Tiempo constante
    public double atacar(Pokemon oponente) {
        try {
            if (oponente == null) {
                return 0.0;
            }
            if (this.estado == EnumEstado.DEBILITADO) {
                return 0.0;
            }

            double multiplicador = 1.0;
            for (EnumTipoPokemon tipoAtacante : this.tipo) {
                multiplicador *= EnumTipoPokemon.obtenerMultiplicadorDeDaño(tipoAtacante, oponente.getTipo());
            }
            return this.puntosDeAtaque * multiplicador;
        } catch (Exception e) {
            Vista.mostrarMensaje("Error en el ataque: " + e.getMessage());
            return 0.0;
        }
    }//atacar

    //Complejidad temporal: O(1) Tiempo constante
    public void recibirDaño(double daño) {
        try {
            if (daño < 0) {
                return;
            }
            this.salud -= daño;
            if (this.salud <= 0) {
                this.salud = 0;
                this.estado = EnumEstado.DEBILITADO;
            }
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al recibir daño: " + e.getMessage());
        }
    }//recibirDaño

    //Complejidad temporal: O(1) Tiempo constante
    public void entrenar() {
        try {
            if (this.estado == EnumEstado.DEBILITADO) {
                Vista.mostrarMensaje("No se puede entrenar a un Pokémon debilitado");
                return;
            }
            this.puntosDeAtaque += 20;
            this.salud += 5;
        } catch (Exception e) {
            Vista.mostrarMensaje("Error al entrenar: " + e.getMessage());
        }
    }//entrenar
    
}//class
