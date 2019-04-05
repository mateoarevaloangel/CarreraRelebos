/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerar;

/**
 *
 * @author daniel
 */
public class Principal {
    static Pista p1=new Pista();
    static Pista p2=new Pista();
    static Pista p3=new Pista();
    
    static Corredor c1=new Corredor(1,p1,"equipo 1");
    static Corredor c2=new Corredor(2,p1,"equipo 1");
    static Corredor c3=new Corredor(3,p1,"equipo 1");
    
    static Corredor c4=new Corredor(1,p2,"equipo 2");
    static Corredor c5=new Corredor(2,p2,"equipo 2");
    static Corredor c6=new Corredor(3,p2,"equipo 2");
    
    static Corredor c7=new Corredor(1,p3,"equipo 3");
    static Corredor c8=new Corredor(2,p3,"equipo 3");
    static Corredor c9=new Corredor(3,p3,"equipo 3");
    
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
