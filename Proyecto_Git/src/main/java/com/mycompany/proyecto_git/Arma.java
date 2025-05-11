package com.mycompany.proyecto_git;

/**
 * Clase que representa un arma en el juego. Hereda de Objeto.
 * Las armas aumentan el ataque del jugador.
 * 
 * @author javhi
 * @version 1.0
 */
public class Arma extends Objeto {
    private int puntos_ataque;

    /**
     * Constructor que inicializa un arma con nombre y puntos de ataque.
     * 
     * @param nombre Nombre del arma.
     * @param puntos_ataque Valor de ataque que proporciona el arma.
     */
    public Arma(String nombre, int puntos_ataque) {
        this.nombre = nombre;
        this.puntos_ataque = puntos_ataque;
    }

    /**
     * @return Puntos de ataque que otorga el arma.
     */
    public int getPuntos_ataque() {
        return puntos_ataque;
    }

    /**
     * @param puntos_ataque Nuevo valor de ataque para el arma.
     */
    public void setPuntos_ataque(int puntos_ataque) {
        this.puntos_ataque = puntos_ataque;
    }
}