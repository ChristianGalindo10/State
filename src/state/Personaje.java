/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author estudiantes
 */
public class Personaje {
    private String nombre;
    private int energia;
    private int poder;
    private int velocidad;
    private boolean transformar;

    public Personaje(String nombre, int energia, int poder, int velocidad , boolean transformar) {
        this.nombre = nombre;
        this.energia = energia;
        this.poder = poder;
        this.velocidad = velocidad;
        this.transformar = transformar;
    }

    public boolean isTransformar() {
        return transformar;
    }

    public void setTransformar(boolean transformado) {
        this.transformar = transformar;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    
}
