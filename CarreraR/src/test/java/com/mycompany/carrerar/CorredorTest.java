/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MateoG
 */
public class CorredorTest {
    
    public CorredorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of opcion1 method, of class Corredor.
     */
    @Test
    public void testOpcion1() throws Exception {
        System.out.println("opcion1");
        Pista p1=new Pista("*");
        Corredor c1=new Corredor(1,p1,"equipo 1");
        String expResult = "*";
        String result = c1.opcion1("*");
        assertEquals(expResult, result);
    }

    /**
     * Test of opcion2 method, of class Corredor.
     */
    @Test
    public void testOpcion2() throws Exception {
        System.out.println("opcion2");
        Pista p1=new Pista("+");
        Corredor c1=new Corredor(1,p1,"equipo 2");
        String expResult = "+";
        String result = c1.opcion1("+");
        assertEquals(expResult, result);
    }

    /**
     * Test of opcion3 method, of class Corredor.
     */
    @Test
    public void testOpcion3() throws Exception {
        System.out.println("opcion3");
        Pista p1=new Pista("o");
        Corredor c1=new Corredor(1,p1,"equipo 3");
        String expResult = "o";
        String result = c1.opcion1("o");
        assertEquals(expResult, result);
    }
    
}
