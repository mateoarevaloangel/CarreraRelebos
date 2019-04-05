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
 */
public class Corredor extends Thread{
    String figura="*";
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
        int j=0;
        while(j<33){
        int i;
            System.out.println(j);
        i= (int)(Math.random()*((3-0)))+0;
        j=j+i;
        pista.pistaP1 = pista.pistaP1.replace('*', '_');
        if(j>32){
            if(pista.pistaP1.charAt(32)!='*'){  
                System.out.println("error");
        }
            j=33;
            pista.pistaP1 = pista.pistaP1.substring(1,j)+'*';
            synchronized(pista){
                pista.notifyAll();
            }
            
        }else{
            pista.pistaP1 = pista.pistaP1.substring(0,j)+'*'+pista.pistaP1.substring(j+1);
        }
        System.out.flush(); 
        System.out.println(equipo+pista.pistaP1+pista.pistaP2+pista.pistaP3);
        Thread.sleep(500);
    }
    }else if(posicion==2){
        
        synchronized(pista){
            if(pista.pistaP1.charAt(32)!='*'){  
                pista.wait();
        }else{
                System.out.println("error");
            }
      }
        int j=0;
        while(j<33){
        int i;
        i= (int)(Math.random()*((3-0)))+0;
        j=j+i;
        pista.pistaP2 = pista.pistaP2.replace('*', '_');
        if(j>32){
            
            j=33;
            pista.pistaP2 = pista.pistaP2.substring(1,j)+'*';
            synchronized(pista){
                pista.notifyAll();
            }
            
        }else{
            pista.pistaP2 = pista.pistaP2.substring(0,j)+'*'+pista.pistaP2.substring(j+1);
        }
        if(pista.pistaP2=="_________________________________"){
            pista.pistaP2="________________________________*";
        }
        System.out.flush(); 
        System.out.println(equipo+pista.pistaP1+pista.pistaP2+pista.pistaP3);
        Thread.sleep(500);
        }
    }else if(posicion==3){
        synchronized(pista){
            if(pista.pistaP2.charAt(32)!='*'){  
                pista.wait();
                if(pista.pistaP2.charAt(32)!='*'){ 
                    pista.wait();
                }
                
        } 
      }
        //System.out.println("esta es pista 2"+pista.pistaP2);
        int j=0;
        while(j<34){
        int i;
        int tamaño=0;
        i= (int)(Math.random()*((3-0)))+0;
        j=j+i;
        pista.pistaP3 = pista.pistaP3.replace('*', '_');
        if(j>32){
            if(pista.pistaP3.charAt(32)!='*'){  
                System.out.println("error");
                j=34;
                 pista.pistaP3 = pista.pistaP3.substring(0,j)+'*';
        }
        }else{
            pista.pistaP3 = pista.pistaP3.substring(0,j)+'*'+pista.pistaP3.substring(j+1);
        }

        //clrscr();
        //gotoxy(0,0);
        System.out.flush();
        System.out.println(equipo+pista.pistaP1+pista.pistaP2+pista.pistaP3);
        Thread.sleep(500);
    }
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

    private void clrscr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void gotoxy(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
