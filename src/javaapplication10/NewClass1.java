/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author DAM 6J
 */


    /**
     * @param args the command line arguments
     */
   /*
 * Ejercicio de Documentación
 * Circulos - Versión sin información
 */

  /**
 * Ejemplo: círculos.
 *
 * @author XXXXX
 * @version 17-04-2017
*/ 
public class NewClass1 {

    private double centroX;
    private double centroY;
    private double radio;
    
    /**
 * Constructor.
 * @param x centro: coordenada X.
 * @param y centro: coordenada Y.
 * @param r radio.
 */

    public NewClass1(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }
/**
 * Getter.
 * @return centro: coordenada X.
 */
    public double getCentroX() {
        return centroX;
    }
/**
 * Calcula la longitud de la circunferencia
(perímetro del círculo).
 * @return perímetro.
 */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
/**
 * Desplaza el círculo a otro lugar.
 * @param despX movimiento en el eje X.
 * @param despY movimiento en el eje Y.
 */
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}