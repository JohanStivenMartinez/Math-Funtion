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
     * la opción de numeros enteros
     */
    
    public static void DivisionInt(int dividendo, int divisor){
        /**
         * @ param args En este espacio se hará la division entre
         * el dividendo y el divisor.
         */
        /*  
            En una variable, llamada resultado
            vamos a meter el "resultado" de esta division
            entre el dividendo y el divisor
        */
        int resultado = dividendo / divisor;
        //Luego de eso se dará el resultado en un mensaje
        System.out.println("El resultado de la división es: "+resultado);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int dividendo;
        int divisor;
        Scanner entrada = new Scanner(System.in);
        //Se ingresan los valores del dividendo y el divisor
        System.out.println("Ingresa el dividendo: "+"\n");
        dividendo = entrada.nextInt();
        System.out.println("Ingresa el divisor: "+"\n");
        divisor = entrada.nextInt();
        //Pregunta si el divisor es igual a 0
        if(divisor == 0){
            //Si lo es, lanza un mensaje
            System.out.println("No se puede hacer la división."+"\n"+"Ya que todo numero dividido"+"\n"+"Entre 0, NO EXISTE.");
        } else {
            //Si no lo es, hará el método correspondiente
            DivisionInt(dividendo,divisor);
        }
    }
    
}
