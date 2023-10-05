/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retos_banco;

/**
 *
 * @author graciela solorzano
 */
        
import java.util.ArrayList;
        import java.util.List;
public class Retos_banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int S = 7; 
        List<Integer> numeros = new ArrayList<>();
        
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(77);
        numeros.add(74);
        numeros.add(9);
        
        
        List<Integer> resultado = switchPositions(numeros, S);
        
        
        System.out.println(resultado);
    }
    
    public static List<Integer> switchPositions(List<Integer> numeros, int S) {
        List<Integer> resultado = new ArrayList<>();
        
        for (int i = numeros.size() - 1; i >= 0; i--) {
            int numero=numeros.get(i);
            int digito=numero % 10;
            
            if (digito < S) {
                resultado.add(numero);
            }
        }
        
        return resultado;
    }
}
    
    

