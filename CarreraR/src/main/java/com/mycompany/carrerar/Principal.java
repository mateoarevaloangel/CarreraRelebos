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
public class Principal {
    /**
     * Objeto tipo pista que recibe el simbolo del equipo
     */
    static Pista p1=new Pista("*");
    /**
     * Objeto tipo pista que recibe el simbolo del equipo
     */
    static Pista p2=new Pista("+");
    /**
     * Objeto tipo pista que recibe el simbolo del equipo
     */
    static Pista p3=new Pista("o");
    
    /**
     * Objeto tipo corredor que recibe la posicion, pista y numero de equipo
     */
    static Corredor c1=new Corredor(1,p1,"equipo 1");
    /**
     * Objeto tipo corredor que recibe la posicion, pista y numero de equipo
     */
    static Corredor c2=new Corredor(2,p1,"equipo 1");
    /**
     * Objeto tipo corredor que recibe la posicion, pista y numero de equipo
     */
    static Corredor c3=new Corredor(3,p1,"equipo 1");
    /**
     * Objeto tipo corredor que recibe la posicion, pista y numero de equipo
     */
    static Corredor c4=new Corredor(1,p2,"equipo 2");
    /**
     * Objeto tipo corredor que recibe la posicion, pista y numero de equipo
     */
    static Corredor c5=new Corredor(2,p2,"equipo 2");
    /**
     * Objeto tipo corredor que recibe la posicion, pista y numero de equipo
     */
    static Corredor c6=new Corredor(3,p2,"equipo 2");
    /**
     * Objeto tipo corredor que recibe la posicion, pista y numero de equipo
     */
    static Corredor c7=new Corredor(1,p3,"equipo 3");
    /**
     * Objeto tipo corredor que recibe la posicion, pista y numero de equipo
     */
    static Corredor c8=new Corredor(2,p3,"equipo 3");
    /**
     * Objeto tipo corredor que recibe la posicion, pista y numero de equipo
     */
    static Corredor c9=new Corredor(3,p3,"equipo 3");
    /**
     * Método ejecutar para iniciar los hilos (9 atletas)
     */
    public void ejecutar(){
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
    }
}
