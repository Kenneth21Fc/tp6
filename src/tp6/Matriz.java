/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author roxi
 */
/** 06/10/2020*/
public class Matriz {
    
    public static void armar(){
        int matriz[] []= new int [4] [];
        matriz[0] = new int [4];
        matriz[1] = new int [3];
        matriz[2] = new int [5];
        matriz[3] = new int [2];
        int i = 3; 
        for (int f = 0; f < matriz.length; f++){
            for( int c = 0; c < matriz[f].length; c++){
                matriz [f] [c] = i;
                i += 3;
            }
        }
        System.out.println("\n");
        for (int ft = 0; ft < matriz.length; ft++){
            System.out.println("Fila "+ ft + " los numeros pares son los siguientes: ");
            for( int ca = 0; ca < matriz[ft].length; ca++){
                System.out.println("Es par " + matriz[ft] [ca] );
            }
        }
    }
    public static void main (String[] args){
        Matriz.armar();
    }
    
}

