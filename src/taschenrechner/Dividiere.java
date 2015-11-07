/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

/**
 *
 * @author Dominik
 */
public class Dividiere implements Berechnung{
    
    public double rechne(double x, double y) throws BerechnungsException{
        
        if(y!=0) {
            return x/y;
        }
        else{
            throw new BerechnungsException("Division durch 0 nicht moeglich!");
        }
    } 
}
