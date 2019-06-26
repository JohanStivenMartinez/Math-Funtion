/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfuntion;

import java.util.Scanner;

/**
 *
 * @author Johan Martinez
 */
public class MathFuntion {

    /**
     * @param args En este espacio se mostrará el 
     * metodo de la division, en este caso se dará
     * la primera opción de entero
     */
    
    public static void DivisionInt(int dividendo, int divisor){
        /**
         * @    En este espacio se hará la division entre
         * el dividendo y el divisor.
         */
        
        int resultado = dividendo / divisor;
        
        //Si el divisor es cero, su resultado no existe
        if(divisor == 0){
            System.out.println("El resultado no existe");
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int dividendo;
        int divisor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el dividendo: "+"\n");
        dividendo = entrada.nextInt();
        System.out.println("Ingresa el divisor: "+"\n");
        divisor = entrada.nextInt();
        if(divisor == 0){
            System.out.println("No se puede hacer la división."+"\n"+"Ya que todo numero dividido"+"\n"+"Entre 0, NO EXISTE.");
        } else {
            DivisionInt(dividendo,divisor);
        }
    }
    
}
