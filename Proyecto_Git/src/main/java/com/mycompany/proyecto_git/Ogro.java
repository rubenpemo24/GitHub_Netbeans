package com.mycompany.proyecto_git;

/**
 * Clase que representa un enemigo de tipo Ogro en el juego.
 * Hereda de Enemigo y define sus atributos por defecto.
 * 
 * @author javhi
 * @version 1.0
 */
public class Ogro extends Enemigo {

    /**
     * Constructor que inicializa un ogro con valores predeterminados
     * de nombre, puntos de vida, ataque y defensa.
     */
    public Ogro() {
        nombre = "Ogro";
        puntos_vida = 50;
        ataque = 30;
        defensa = 5;
    }

    /**
     * Determina si el ogro realiza un ataque con éxito.
     * Tiene una probabilidad del 70% de acertar el ataque.
     * 
     * @return true si el ataque tiene éxito, false en caso contrario.
     */
    @Override
    public boolean atacar() {
        return Math.random() * 100 <= 70;
    }
}
