/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author graciela solorzano
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int S = 7; 
        List<Integer> numeros = new ArrayList<>();

       
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(6);
        numeros.add(8);
        numeros.add(9);

        
        List<Integer> resultado = squareAndFilter(numeros, S);

        
        System.out.println(resultado);
    }

    public static List<Integer> squareAndFilter(List<Integer> numeros, int S) {
        List<Integer> resultado = new ArrayList<>();

        for (int numero : numeros) {
            int cuadrado=numero * numero;

            if (cuadrado <=S*S) {
                resultado.add(cuadrado);
            }
        }

        return resultado;
    }
}
    
    
    

