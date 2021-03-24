/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Local;

/**
 *
 * @author Cristian
 */
@Local
public interface CalBeanLocal {

    Integer sumar(int valor1, int valor2);
    
    Integer restar(int valor1, int valor2);

    Integer multiplicar(int valor1, int valor2);

    Double dividir(double valor1, double valor2);

    Double potenciacion(double valor1, double valor2);

    Integer modulo(int valor1, int valor2);
}
