package com.mycompany.proyecto_git;

/**
 * Clase que representa a un enemigo en el juego.
 * Define atributos básicos como salud, ataque y defensa, así como métodos para interactuar en combate.
 * 
 * @author javhi
 * @version 1.0
 */
public class Enemigo {
    protected String nombre;
    protected int puntos_vida;
    protected int max_vida;
    protected int ataque;
    protected int defensa;

    /**
     * Constructor por defecto de la clase Enemigo.
     */
    public Enemigo() {
        
    }

    /**
     * @return Nombre del enemigo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nombre que se asignará al enemigo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Puntos de vida actuales del enemigo.
     */
    public int getPuntos_vida() {
        return puntos_vida;
    }

    /**
     * @param puntos_vida Nuevos puntos de vida a asignar.
     */
    public void setPuntos_vida(int puntos_vida) {
        this.puntos_vida = puntos_vida;
    }

    /**
     * @return Valor máximo de vida del enemigo.
     */
    public int getMax_vida() {
        return max_vida;
    }

    /**
     * @param max_vida Valor máximo de vida a establecer.
     */
    public void setMax_vida(int max_vida) {
        this.max_vida = max_vida;
    }

    /**
     * @return Valor de ataque del enemigo.
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque Valor de ataque a establecer.
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return Valor de defensa del enemigo.
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa Valor de defensa a establecer.
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * Realiza un ataque. Tiene un 80% de probabilidad de éxito.
     * 
     * @return true si el ataque acierta, false si falla.
     */
    public boolean atacar() {
        return Math.random() * 100 <= 80;
    }

    /**
     * El enemigo recibe un ataque y se reduce su vida en función del daño recibido.
     * 
     * @param ataque Valor de ataque recibido.
     */
    public void recibir_ataque(int ataque) {
        puntos_vida = (puntos_vida + defensa) - ataque;
    }

    /**
     * El enemigo recibe daño de una magia específica.
     * 
     * @param tipo_magia Tipo de magia usada.
     */
    public void recibir_magia(String tipo_magia) {
        switch (tipo_magia) {
            case "fuego":
                puntos_vida = puntos_vida - 30;
                break;
            case "viento":
                puntos_vida = puntos_vida - 15;
                break;
        }
    }
}
