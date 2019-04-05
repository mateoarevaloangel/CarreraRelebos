/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerar;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.5
 */
public class Corredor extends Thread{
    /**
     * Variable que guarda la posicion de relevo del atleta en el equipo
     */
    int posicion;
    /**
     * Objeto tipo Pista para los tres atletas por equipo
     */
    Pista pista;
    /**
     * Variable que guarda el numero del equipo
     */
    String equipo;
    /**
     * Constructor de Corredor
     * @param posicion recibe numero de posicion del atleta en la pista
     * @param pista recibe objeto pista para la impresion con los atletas
     * @param equipo recibe numero de equipo
     */
    public Corredor(int posicion, Pista pista, String equipo) {
        this.posicion=posicion;
        this.pista=pista;
        this.equipo=equipo;
    }
    /**
     * Método recorrer que se inicia en cada hilo
     */
    private void recorrer() throws InterruptedException{
        switch (posicion) {
            case 1:
                opcion1("*");
                break;
            case 2:
                opcion2("+");
                break;
            case 3:
                opcion3("o");
                break;
            default:
                break;
        }
    }
    /**
     * Método run que ejecuta la funcion recorrer en cada hilo
     */
   @Override
    public void run(){
        try {
            recorrer();
        } catch (InterruptedException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Método del avance del atleta según su posición en la pista
     * @param fig recibe el simbolo del atleta
     * @return devuelve el simbolo cuando el atleta termina el relevo
     * @throws InterruptedException
     */
    public String opcion1(String fig) throws InterruptedException{
        int j=0;
        while(j<33){
        int i;
        i= (int)(Math.random()*((3-0)))+0;
        j=j+i;
        pista.pistaP1 = pista.pistaP1.replace(pista.figura.charAt(0), '_');
        if(j>32){
            j=33;
            pista.pistaP1 = pista.pistaP1.substring(1,j)+pista.figura.charAt(0);
            synchronized(pista){
                pista.notifyAll();
            }
            
        }else{
            pista.pistaP1 = pista.pistaP1.substring(0,j)+pista.figura.charAt(0)+pista.pistaP1.substring(j+1);
        }
        
        System.out.println(equipo+pista.pistaP1+pista.pistaP2+pista.pistaP3);
        if(equipo == "equipo 3"){
            for (int a=0; a<30; a++){
                System.out.println();
            }
        }
        Thread.sleep(500);
    }
        return fig;
    }
    /**
     * Método del avance del atleta según su posición en la pista
     * @param fig recibe el simbolo del atleta
     * @return devuelve el simbolo cuando el atleta termina el relevo
     * @throws InterruptedException
     */
    public String opcion2(String fig) throws InterruptedException{
        synchronized(pista){
            if(pista.pistaP1.charAt(32)!=pista.figura.charAt(0)){  
                pista.wait();
        }
      }
        int j=0;
        while(j<33){
        int i;
        i= (int)(Math.random()*((3-0)))+0;
        j=j+i;
        pista.pistaP2 = pista.pistaP2.replace(pista.figura.charAt(0), '_');
        if(j>32){
            j=33;
            pista.pistaP2 = pista.pistaP2.substring(1,j)+pista.figura.charAt(0);
            synchronized(pista){
                pista.notifyAll();
            }
            
        }else{
            pista.pistaP2 = pista.pistaP2.substring(0,j)+pista.figura.charAt(0)+pista.pistaP2.substring(j+1);
        }
        if(pista.pistaP2=="_________________________________"){
            pista.pistaP2="________________________________"+pista.figura.charAt(0);
        }
        System.out.println(equipo+pista.pistaP1+pista.pistaP2+pista.pistaP3);
        if(equipo == "equipo 3"){
            for (int a=0; a<30; a++){
                System.out.println();
            }
        }
        Thread.sleep(500);
        }
        return fig;
    }
    /**
     * Método del avance del atleta según su posición en la pista
     * @param fig recibe el simbolo del atleta
     * @return devuelve el simbolo cuando el atleta termina el relevo
     * @throws InterruptedException
     */
    public String opcion3(String fig) throws InterruptedException{
        synchronized(pista){
            if(pista.pistaP2.charAt(32)!=pista.figura.charAt(0)){  
                pista.wait();
                if(pista.pistaP2.charAt(32)!=pista.figura.charAt(0)){ 
                    pista.wait();
                }
        } 
      }
        int j=0;
        while(j<34){
        int i;
        i= (int)(Math.random()*((3-0)))+0;
        j=j+i;
        pista.pistaP3 = pista.pistaP3.replace(pista.figura.charAt(0), '_');
        if(j>32){
            if(pista.pistaP3.charAt(32)!=pista.figura.charAt(0)){  
                j=34;
                 pista.pistaP3 = pista.pistaP3.substring(0,j)+pista.figura.charAt(0);
                 System.out.println(equipo+pista.pistaP1+pista.pistaP2+pista.pistaP3);
                 System.out.println("¡Ganó el "+equipo+"!");
                 System.exit(0);
        }
        }else{
            pista.pistaP3 = pista.pistaP3.substring(0,j)+pista.figura.charAt(0)+pista.pistaP3.substring(j+1);
        }

        System.out.println(equipo+pista.pistaP1+pista.pistaP2+pista.pistaP3);
        if(equipo == "equipo 3"){
            for (int a=0; a<30; a++){
                System.out.println();
            }
        }
        Thread.sleep(500);
    }
        return fig;
    }
}
