package com.mycompany.proyecto_git;

/**
 * Clase base que representa un objeto en el juego. 
 * Los objetos tienen un nombre y un estado que indica si han sido obtenidos.
 * 
 * @author javhi
 * @version 1.0
 */
public class Objeto {
    protected String nombre;
    protected boolean obtenido = false;

    /**
     * Constructor que inicializa un objeto sin nombre ni estado de obtención.
     */
    public Objeto() {
    }

    /**
     * Obtiene el nombre del objeto.
     * 
     * @return Nombre del objeto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del objeto.
     * 
     * @param nombre Nuevo nombre para el objeto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Verifica si el objeto ha sido obtenido.
     * 
     * @return true si el objeto ha sido obtenido, false si no lo ha sido.
     */
    public boolean isObtenido() {
        return obtenido;
    }

    /**
     * Establece el estado de obtención del objeto.
     * 
     * @param obtenido Estado de obtención del objeto.
     */
    public void setObtenido(boolean obtenido) {
        this.obtenido = obtenido;
    }
}
