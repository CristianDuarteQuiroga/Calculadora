/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Stateless;

/**
 *
 * @author Cristian
 */
@Stateless
public class CalBean implements CalBeanLocal {

    @Override
    public Integer sumar(int valor1, int valor2) {
        
        return valor1 + valor2; 
    }
    public Integer restar(int valor1, int valor2) {
        
        return valor1 - valor2; 
    }
    public Integer multiplicar(int valor1, int valor2) {
        
        return valor1 * valor2; 
    }
    public Double dividir(double valor1, double valor2) {
        
        return valor1 / valor2; 
    }
    public Double potenciacion(double valor1, double valor2) {
        
        return Math.pow(valor1, valor2); 
    }
    public Integer modulo(int valor1, int valor2) {
        
        return valor1 % valor2; 
    }
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    
}
