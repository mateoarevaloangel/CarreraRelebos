/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerar;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.5
 */
public class Pista {
    /**
     * Variable tipo string que guarda el tamaño de la pista para el atleta 1
     */
    String pistaP1;
    /**
     * Variable tipo string que guarda el tamaño de la pista para el atleta 2
     */
    String pistaP2;
    /**
     * Variable tipo string que guarda el tamaño de la pista para el atleta 3
     */
    String pistaP3;
    /**
     * Variable que guarda el simbolo que representa al atleta
     */
    String figura;
    /**
     * Constructor para formar la pista de 100 pasos
     * @param figura recibe el simbolo del atleta
     */
    public Pista(String figura) {
        this.figura = figura;
        this.pistaP1 = figura+"________________________________";
        this.pistaP2 = figura+"________________________________";
        this.pistaP3 = figura+"_________________________________";
    }
}
