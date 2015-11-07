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
public class BerechnungsException extends Exception {
    private String fehlertext;
    
    public BerechnungsException(String fehlertext){
        this.fehlertext = fehlertext;
    }
    
    public String gibFehlertext(){
        return fehlertext;
    }
            
}
