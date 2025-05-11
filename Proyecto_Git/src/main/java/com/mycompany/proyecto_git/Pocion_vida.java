package com.mycompany.proyecto_git;

/**
 * Clase que representa una poción de vida en el juego.
 * Hereda de Objeto y define el valor de la poción que puede restaurar la vida.
 * 
 * @author javhi
 * @version 1.0
 */
public class Pocion_vida extends Objeto {
    int valor;

    /**
     * Constructor que inicializa una poción de vida con un nombre y valor predeterminado.
     * El valor de la poción es 20, que representa la cantidad de vida que puede restaurar.
     */
    public Pocion_vida() {
        nombre = "Pocion_vida";
        valor = 20;
    }

    /**
     * Obtiene el valor de la poción de vida.
     * 
     * @return Valor de la poción, que representa la cantidad de vida que restaura.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Establece un nuevo valor para la poción de vida.
     * 
     * @param valor Nuevo valor de la poción, que representa la cantidad de vida que restaura.
     * @exception IllegalArgumentException Si el valor de la poción es negativo.
     */
    public void setValor(int valor) {
        if (valor < 0) {
        throw new IllegalArgumentException("El valor de la poción no puede ser negativo.");
    }
        this.valor = valor;
    }
}
