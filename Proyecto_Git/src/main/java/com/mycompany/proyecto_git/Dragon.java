package com.mycompany.proyecto_git;

/**
 * Clase que representa un enemigo de tipo Dragón en el juego. 
 * Hereda de Enemigo y tiene características mejoradas.
 * 
 * @author javhi
 * @version 1.0
 */
public class Dragon extends Enemigo {

    /**
     * Constructor que inicializa un dragón con valores predefinidos
     * de nombre, puntos de vida, ataque y defensa.
     */
    public Dragon() {
        nombre = "Dragon";
        puntos_vida = 100;
        ataque = 35;
        defensa = 20;
    }

    /**
     * Determina si el dragón realiza un ataque con éxito.
     * Tiene una probabilidad del 90% de acertar el ataque.
     * 
     * @return true si el ataque tiene éxito, false en caso contrario.
     */
    @Override
    public boolean atacar() {
        return Math.random() * 100 <= 90;
    }
}
