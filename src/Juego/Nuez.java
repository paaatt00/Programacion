/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author Alvaro y Patricia
 */
public class Nuez extends NPC {
    
    private int coste;

    public Nuez(String nombre, int daño, int resistencia, int frecuencia, int coste) {
        super(nombre, daño, resistencia, frecuencia);
        this.coste = coste;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
    @Override
    public String toString() {
        return "  " + this.getNombre() + " (" + this.getResistencia() + ")";
    }
}
