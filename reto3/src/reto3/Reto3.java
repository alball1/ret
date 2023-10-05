/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto3;

import java.util.Arrays;

/**
 *
 * @author graciela solorzano
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         int[] denominaciones = {5, 7, 1, 1, 2, 3, 22}; 
        int resultado=minAmountOfChange(denominaciones);
        System.out.println("La cantidad mínima de cambio que no puedes dar es: "+resultado);
    }

    public static int minAmountOfChange(int[] denominaciones) {
        Arrays.sort(denominaciones); 
        int cambioMinimo = 1; 

        for (int denominacion : denominaciones) {
            if (denominacion<= cambioMinimo) {
                cambioMinimo+= denominacion;
            }else {
                
                break;
            }
        }

        return cambioMinimo;
    }
}







    
    

