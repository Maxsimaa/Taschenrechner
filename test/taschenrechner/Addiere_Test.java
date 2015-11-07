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
public class Addiere_Test {
    Berechnung b;
    double ergebnis;
    
    public Addiere_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b = new Addiere();
        ergebnis = 0.0;
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testeAddition()
    {
        try{
            ergebnis = b.rechne(253.12,500);
            assertEquals(753.12,ergebnis,0.0);
        }
        catch(BerechnungsException e){
        }
    }
    
    @Test
    public void testeDoppeltNegativeAddition()
    {
        try{
            ergebnis = b.rechne(-253.12,-500);
            assertEquals(-753.12,ergebnis,0.0);
        }
        catch(BerechnungsException e){
        }
    }
    
    @Test
    public void testeNegativeAddition()
    {
        try{
            ergebnis = b.rechne(-253.12,500);
            assertEquals(246.88,ergebnis,0.0);
        }
        catch(BerechnungsException e){
        }
    }
}
