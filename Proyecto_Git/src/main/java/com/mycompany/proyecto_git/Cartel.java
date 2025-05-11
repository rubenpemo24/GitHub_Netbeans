package com.mycompany.proyecto_git;

/**
 * Clase que representa un cartel en el juego.
 * Un cartel contiene un texto que puede mostrar mensajes al jugador.
 * 
 * @author javhi
 * @version 1.0
 */
public class Cartel {
    private String texto;

    /**
     * Constructor que crea un cartel con el texto especificado.
     * 
     * @param texto Texto que contiene el cartel.
     */
    public Cartel(String texto) {
        this.texto = texto;
    }

    /**
     * Obtiene el texto del cartel.
     * 
     * @return Texto actual del cartel.
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Establece un nuevo texto para el cartel.
     * 
     * @param texto Nuevo texto que se mostrará en el cartel.
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
