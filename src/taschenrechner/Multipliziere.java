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
public class Multipliziere implements Berechnung{
    
    public double rechne(double x,double y) throws BerechnungsException {
        return x*y;
    }
    
}
