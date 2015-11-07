/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Kommandozeile implements Ausgabe {
    
    Scanner scan;
    
    public Kommandozeile(){
        scan = new Scanner(System.in);
    }
    
    public void zeigeErgebnis(double erg){
        System.out.println(erg);
    }
    
    private String scanneOperator(){
        return scan.next();
    }
    
    private double scanneZahl(){
        return scan.nextDouble();
    }
    
    public double gibZahl(int zahlnummer){
        System.out.println(zahlnummer + ". Zahl: ");
        return scanneZahl();
    }
    
    public String gibOperator(){
        System.out.println("Operator: ");
        return scanneOperator();
    }
}
