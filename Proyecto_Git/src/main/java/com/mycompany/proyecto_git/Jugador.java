package com.mycompany.proyecto_git;

/**
 * Clase que representa a un jugador en el juego.
 * Contiene atributos relacionados con la salud, magia, combate y equipamiento.
 * 
 * @author javhi
 * @version 1.0
 */
public class Jugador {
    private String nombre;
    private String arma_equipada;
    private String armadura_equipada;
    private int puntos_vida;
    private int puntos_magia;
    private int max_vida;
    private int max_magia;
    private int ataque;
    private int defensa;
    private boolean pelea;

    /**
     * Constructor que crea un nuevo jugador con valores predeterminados.
     * 
     * @param nombre Nombre del jugador.
     */
    Jugador(String nombre){
        this.nombre=nombre;
        puntos_vida=50;
        puntos_magia=50;
        max_vida=50;
        max_magia=50;
        ataque=20;
        defensa=10;
        pelea=false;
    }

    /** @return Nombre del jugador. */
    public String getNombre() {
        return nombre;
    }

    /** 
     * @param nombre Nombre a establecer para el jugador. 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return Nombre del arma equipada. */
    public String getArma_equipada() {
        return arma_equipada;
    }

    /** 
     * @param arma_equipada Nombre del arma a equipar. 
     */
    public void setArma_equipada(String arma_equipada) {
        this.arma_equipada = arma_equipada;
    }

    /** @return Nombre de la armadura equipada. */
    public String getArmadura_equipada() {
        return armadura_equipada;
    }

    /** 
     * @param armadura_equipada Nombre de la armadura a equipar. 
     */
    public void setArmadura_equipada(String armadura_equipada) {
        this.armadura_equipada = armadura_equipada;
    }

    /** @return Puntos de vida actuales del jugador. */
    public int getPuntos_vida() {
        return puntos_vida;
    }

    /** 
     * @param puntos_vida Nuevo valor para los puntos de vida. 
     */
    public void setPuntos_vida(int puntos_vida) {
        this.puntos_vida = puntos_vida;
    }

    /** @return Puntos de magia actuales del jugador. */
    public int getPuntos_magia() {
        return puntos_magia;
    }

    /** 
     * @param puntos_magia Nuevo valor para los puntos de magia. 
     */
    public void setPuntos_magia(int puntos_magia) {
        this.puntos_magia = puntos_magia;
    }

    /** @return Valor máximo de vida. */
    public int getMax_vida() {
        return max_vida;
    }

    /** 
     * @param max_vida Nuevo valor máximo de vida. 
     */
    public void setMax_vida(int max_vida) {
        this.max_vida = max_vida;
    }

    /** @return Valor máximo de magia. */
    public int getMax_magia() {
        return max_magia;
    }

    /** 
     * @param max_magia Nuevo valor máximo de magia. 
     */
    public void setMax_magia(int max_magia) {
        this.max_magia = max_magia;
    }

    /** @return Valor de ataque del jugador. */
    public int getAtaque() {
        return ataque;
    }

    /** 
     * @param ataque Nuevo valor para el ataque. 
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /** @return Valor de defensa del jugador. */
    public int getDefensa() {
        return defensa;
    }

    /** 
     * @param defensa Nuevo valor para la defensa. 
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /** @return Estado de combate (true si está peleando). */
    public boolean isPelea() {
        return pelea;
    }

    /** 
     * @param pelea Estado de combate a establecer. 
     */
    public void setPelea(boolean pelea) {
        this.pelea = pelea;
    }

    /**
     * Permite al jugador usar un objeto, como una poción de vida o magia.
     * 
     * @param tipo_objeto Tipo de objeto a usar.
     */
    public void usar_objeto(String tipo_objeto){
        switch(tipo_objeto){
            case "pocion_vida":
                puntos_vida=puntos_vida+20;
                if(puntos_vida>max_vida){
                    puntos_vida=max_vida;
                }
                break;
            case "pocion_magia":
                puntos_magia=puntos_magia+20;
                if(puntos_magia>max_magia){
                    puntos_magia=max_magia;
                }
                break;
        }
    }

    /**
     * Inicia una pelea estableciendo el estado de combate a true.
     */
    public void pelear(){
        pelea=true;
    }

    /**
     * Equipa un arma o armadura y aumenta las estadísticas del jugador.
     * 
     * @param nombre Nombre del objeto.
     * @param tipo_equipo Tipo del equipo.
     * @param numero Valor de ataque o defensa que aporta el objeto.
     */
    public void equipar(String nombre, String tipo_equipo, int numero){
        switch(tipo_equipo){
            case "arma":
                ataque=ataque+numero;
                arma_equipada=nombre;
                break;
            case "armadura":
                defensa=defensa+numero;
                armadura_equipada=nombre;                
                break;
        }
    }

    /**
     * Realiza un ataque. Tiene un 80% de probabilidad de éxito.
     * 
     * @return true si el ataque acierta, false si falla.
     */
    public boolean atacar(){
        return Math.random()*100 <= 80;
    }

    /**
     * El jugador recibe un ataque, se reduce la vida considerando la defensa.
     * 
     * @param ataque Valor de ataque recibido.
     */
    public void recibir_ataque(int ataque){
        puntos_vida=(puntos_vida+defensa)-ataque;
        if(puntos_vida<=0){
            puntos_vida=0;
            System.out.println("Has perdido");
        }
    }

    /**
     * El jugador intenta huir de una pelea. Tiene un 70% de probabilidad de éxito.
     */
    public void huir(){
        if(Math.random()*100<=70){
            pelea=false;
        };
    }

    /**
     * Usa una magia específica que puede causar daño o curar.
     * 
     * @param tipo_magia Tipo de magia.
     */
    public void usar_magia(String tipo_magia){
        switch(tipo_magia){
            case "fuego":
                puntos_magia=puntos_magia-25;
                if(puntos_magia<0){
                    puntos_magia=0;
                }
                break;
            case "viento":
                puntos_magia=puntos_magia-10;
                if(puntos_magia<0){
                    puntos_magia=0;
                }                
                break;
            case "cura":
                puntos_vida=puntos_vida+30;
                if(puntos_vida>max_vida){
                    puntos_vida=max_vida;
                }
                puntos_magia=puntos_magia-15;
                if(puntos_magia<0){
                    puntos_magia=0;
                }
                break;
        }
    }
}
