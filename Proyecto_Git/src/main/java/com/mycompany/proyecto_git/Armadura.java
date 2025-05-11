package com.mycompany.proyecto_git;

/**
 * Clase que representa una armadura en el juego. Hereda de Objeto.
 * Las armaduras aumentan la defensa del jugador.
 * 
 * @author javhi
 * @version 1.0
 */
public class Armadura extends Objeto {
    private int puntos_defensa;

    /**
     * Constructor que inicializa una armadura con nombre y puntos de defensa.
     * 
     * @param nombre Nombre de la armadura.
     * @param puntos_defensa Valor de defensa que proporciona la armadura.
     */
    public Armadura(String nombre, int puntos_defensa) {
        this.nombre = nombre;
        this.puntos_defensa = puntos_defensa;
    }

    /**
     * @return Puntos de defensa que otorga la armadura.
     */
    public int getPuntos_defensa() {
        return puntos_defensa;
    }

    /**
     * @param puntos_defensa Nuevo valor de defensa para la armadura.
     */
    public void setPuntos_defensa(int puntos_defensa) {
        this.puntos_defensa = puntos_defensa;
    }
    
    
}
