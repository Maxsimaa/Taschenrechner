/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

import java.util.InputMismatchException;
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
    
    @Override
    public void zeigeErgebnis(double erg){
        System.out.print("=");
        System.out.println(erg);
    }
    
    private String scanneOperator(){
            return scan.next();
    }
    
    private double scanneZahl(){
            return scan.nextDouble();
        }        
    
    @Override
    public double gibZahl(int zahlnummer){
        System.out.println(zahlnummer + ". Zahl: ");
        System.out.print(">");
        return scanneZahl();
    }
    
    @Override
    public String gibOperator(){
        System.out.println("Operator: ");
        System.out.print(">");
        return scanneOperator();
    }
    
    @Override
    public void zeigeWillkommenstext(){
        System.out.println("Gueltige Rechenzeichen sind: +,-,*,/,p,w\np = Potenzieren: die 2. Zahl ist der Exponent\nw = Wurzel ziehen: 2. Zahl = 3 bedeutet Wurzel aus 3");
    }
}
