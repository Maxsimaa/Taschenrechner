/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Domi
 */
public class Subtrahiere_Test {
    Berechnung b;
    double ergebnis;
    
    public Subtrahiere_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b = new Subtrahiere();
        ergebnis = 0.0;
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testeSubtraktion()
    {
        try{
            ergebnis = b.rechne(100.0,50.0);
            assertEquals(50.0,ergebnis,0.0);
        }
        catch(BerechnungsException e){
        }
    }
}
