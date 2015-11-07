/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

/**
 *
 * @author Domi
 */
public class Wurzel  implements Berechnung{
    
    public double rechne(double x,double y) throws BerechnungsException {
        if(y == 3){
            return Math.cbrt(x);
        }
        else{
            return Math.sqrt(x);
        }
    }
}
