/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Excepciones.ExcepcionPlanta;

/**
 *
 * @author Alvaro
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionPlanta  {

        Tablero tablero = new Tablero();

        tablero.actualizarTablero();

    }

}
