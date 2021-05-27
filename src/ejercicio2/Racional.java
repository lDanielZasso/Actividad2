/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author danie
 */
public class Racional {
    
    private int numerador;
    private int denominador;
    
    public static void main(String[] args) {
        Racional a = new Racional(3,5);
        Racional b = new Racional(2,6);
        Racional c = new Racional(1,1);
        Racional d = new Racional(3,5);
        
        System.out.print("a = ");
        a.imprimir();
        System.out.print("b = ");
        b.imprimir();
        
        System.out.print("a+b = ");
        a.suma(b).imprimir();
        
        System.out.print("a-b = ");
        a.resta(b).imprimir();
        
        System.out.print("a*b = ");
        a.producto(b).imprimir();
        
        System.out.print("a/b = ");
        a.division(b).imprimir();
        
        if(a.esIgual(d))
            System.out.println("a y b son iguales");
        else
            System.out.println("a y b son distintos");
        
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void asignaNumerador(int x){
        this.numerador = x;
    }
    
    public void asignaDenominador(int y){
        this.denominador = y;
    }
    
    public void imprimir(){
        System.out.println(numerador+"/"+denominador);
    }

    @Override
    public String toString() {
        return "Racional{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }
    
    public Racional suma(Racional b){
        Racional r = new Racional(1,1);
        
        if(this.denominador == b.denominador){
            r.asignaNumerador(this.numerador+b.numerador);
            r.asignaDenominador(this.denominador);
        }else{
            r.asignaNumerador((this.numerador*b.denominador)+(this.denominador*b.numerador));
            r.asignaDenominador(this.denominador*b.denominador);
        }
        return r;
    }
    
    public Racional resta(Racional b){
        Racional r = new Racional(1,1);
        
        if(this.denominador == b.denominador){
            r.asignaNumerador(this.numerador-b.numerador);
            r.asignaDenominador(this.denominador);
        }else{
            r.asignaNumerador((this.numerador*b.denominador)-(this.denominador*b.numerador));
            r.asignaDenominador(this.denominador*b.denominador);
        }
        return r;
    }
    
    public Racional producto(Racional b){
        Racional r = new Racional(1,1);
        
        r.asignaNumerador(this.numerador*b.numerador);
        r.asignaDenominador(this.denominador*b.denominador);
        
        return r;
    }
    
    public Racional division(Racional b){
        Racional r = new Racional(1,1);
        
        r.asignaNumerador(this.numerador*b.denominador);
        r.asignaDenominador(this.denominador*b.numerador);
        
        return r;
    }
    
    public boolean esIgual(Racional b){
        if((this.numerador/this.denominador) == (b.numerador/b.denominador))
            return true;
        return false;
    }
            
}
