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
    int posicion;
    Pista pista;
    String equipo;
    public Corredor(int posicion, Pista pista, String equipo) {
        this.posicion=posicion;
        this.pista=pista;
        this.equipo=equipo;
    }
    private void recorrer() throws InterruptedException{
      if(posicion==1){
        opcion1();
    }else if(posicion==2){
        opcion2();
    }else if(posicion==3){
        opcion3();
    }
    }
   @Override
    public void run(){
        try {
            recorrer();
        } catch (InterruptedException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void opcion1() throws InterruptedException{
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
    }
    public void opcion2() throws InterruptedException{
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
    }
    public void opcion3() throws InterruptedException{
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
    }
}
