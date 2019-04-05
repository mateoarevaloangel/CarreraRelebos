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
    String pistaP1;
    String pistaP2;
    String pistaP3;
    String figura;
    public Pista(String figura) {
        this.figura = figura;
        this.pistaP1 = figura+"________________________________";
        this.pistaP2 = figura+"________________________________";
        this.pistaP3 = figura+"_________________________________";
    }
}
