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
public class Complejo {
    private double pReal;
    private double pImag;

    public Complejo(double pReal, double pImag) {
        this.pReal = pReal;
        this.pImag = pImag;
    }
    
    public void asignar(double x, double y){
        pReal = x;
        pImag = y;
    }
    
    public void sumar(Complejo b){
        System.out.println("El complejo resultante es: "+(this.pReal+b.pReal)+" + "+(this.pImag+b.pImag)+"i");
    }
    
    public void imprimir(){
        System.out.println(this.pReal+" + "+this.pImag+"i");
    }
}
