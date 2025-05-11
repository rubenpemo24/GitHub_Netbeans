package com.mycompany.proyecto_git;

/**
 * Clase que representa un enemigo de tipo Gárgola en el juego.
 * Hereda de {@link Enemigo} y define sus atributos por defecto.
 * 
 * @author javhi
 * @version 1.0
 */
public class Gargola extends Enemigo {

    /**
     * Constructor que inicializa una gárgola con valores predeterminados
     * de nombre, puntos de vida, ataque y defensa.
     */
    public Gargola() {
        nombre = "Gargola";
        puntos_vida = 60;
        ataque = 25;
        defensa = 1;
    }
    
    /**
     * Determina si la gárgola realiza un ataque con éxito.
     * Tiene una probabilidad del 60% de acertar el ataque.
     * 
     * @return true si el ataque tiene éxito, false en caso contrario.
     */
    @Override
    public boolean atacar() {
        return Math.random() * 100 <= 60;
    }
}
