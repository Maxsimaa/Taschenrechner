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
public class Dividiere_Test {
    Berechnung b;
    double ergebnis;
    
    public Dividiere_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b = new Dividiere();
        ergebnis = 0.0;
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testeBerechnungsExcpetion(){
        try{
             b.rechne(5.0,0.0);
        }
        catch(BerechnungsException e)
        {
           assertTrue(e.gibFehlertext().equals("Division durch 0 nicht moeglich!"));
        }
    }
    
    @Test
    public void testeDivisionDurchNegativ(){
        
        try{
            ergebnis = b.rechne(6.0,-2.0);
        }
        catch(BerechnungsException e)
        {
           assertEquals(-3.0,ergebnis,0.0);
        }
    }
}
