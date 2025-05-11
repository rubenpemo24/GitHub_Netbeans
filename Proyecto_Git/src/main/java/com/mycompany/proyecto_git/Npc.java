package com.mycompany.proyecto_git;

/**
 * Clase que representa un NPC en el juego.
 * Un NPC tiene un nombre y un diálogo que puede mostrar al jugador.
 * 
 * @author javhi
 * @version 1.0
 */
public class Npc {
    private String nombre;
    private String dialogo;

    /**
     * Constructor que inicializa un NPC con su nombre y diálogo.
     * 
     * @param nombre Nombre del NPC.
     * @param dialogo Texto que el NPC puede decir al jugador.
     */
    public Npc(String nombre, String dialogo) {
        this.nombre = nombre;
        this.dialogo = dialogo;
    }

    /**
     * Obtiene el nombre del NPC.
     * 
     * @return Nombre del NPC.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el NPC.
     * 
     * @param nombre Nuevo nombre para el NPC.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el diálogo del NPC.
     * 
     * @return Diálogo actual del NPC.
     */
    public String getDialogo() {
        return dialogo;
    }

    /**
     * Establece un nuevo diálogo para el NPC.
     * 
     * @param dialogo Nuevo diálogo que el NPC puede decir.
     */
    public void setDialogo(String dialogo) {
        this.dialogo = dialogo;
    }
}
