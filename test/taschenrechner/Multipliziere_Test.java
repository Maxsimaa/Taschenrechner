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
public class Multipliziere_Test {
    Berechnung b;
    double ergebnis;
    
    public Multipliziere_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b = new Multipliziere();
        ergebnis = 0.0;
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testeMultipliziere()
    {
        try{
            ergebnis = b.rechne(30.0,20.0);
            assertEquals(600.0,ergebnis,0.0);
        }
        catch(BerechnungsException e){
        }
    }
    
    @Test
    public void testeMultiplikationMitNull()
    {
        try{
            ergebnis = b.rechne(253.12,0);
            assertEquals(0,ergebnis,0.0);
        }
        catch(BerechnungsException e){
        }
    }
}
