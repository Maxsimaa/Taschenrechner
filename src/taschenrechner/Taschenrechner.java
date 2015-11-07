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
public class Taschenrechner {
        
    private boolean stop;
    private Berechnung rechner;
    private Ausgabe ausgabe;
    private double ergebnis;
    private double x;
    private double y;
    private String operator;
    private Scanner scan;

    public Taschenrechner() {
        ausgabe = new Kommandozeile();
        scan = new Scanner(System.in);
        programmSchleife();     
    }
    
    private void programmSchleife(){
        stop = false;
        
        while(!stop){
        
            x = ausgabe.gibZahl(1);
        
            operator = ausgabe.gibOperator();
        
            y = ausgabe.gibZahl(2);
                
            waehleRechenart();
                
            starteBerechnung();
                 
            fortfahren();
        }
    }
            
    private void waehleRechenart(){
        switch (operator) {
            case "*": 
                    rechner = new Multipliziere(); break;
                        
            case ":":
                    rechner = new Dividiere(); break;
                    
            case "/":
                    rechner = new Dividiere(); break;
                        
            case "+": 
                    rechner = new Addiere(); break;
                        
            case "-":
                    rechner = new Subtrahiere(); break;
                
            case "^":
                    rechner = new Potenziere(); break;
        }
    }
        
    private void fortfahren(){
        System.out.println();
        System.out.println("Noch eine Rechenoperation? Eingabe 'ja':  ");
        String bool = scan.next();
        bool = bool.trim().toLowerCase();
        
        if(!bool.equals("ja")) {
            stop = true;
        }
    }
        
    private void starteBerechnung(){
        try{
            ergebnis = rechner.rechne(x, y);
            ausgabe.zeigeErgebnis(ergebnis);
        }
        catch(BerechnungsException e){
            System.out.println(e.gibFehlertext()); 
        }
    }
}




