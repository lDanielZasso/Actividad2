/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author danie
 */
public class PruebaComplejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complejo c1 = new Complejo(3, 5);
        Complejo c2 = new Complejo(2, -7);
        
        c1.imprimir();
        c2.imprimir();
        c1.sumar(c2);
    }
    
}
