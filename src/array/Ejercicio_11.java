/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ville
 */
public class Ejercicio_11 {
    public static void main(String args[]){
        int diagonal[][]=new int[5][5];
        llenarMatriz(diagonal);
        imprimirMatriz(diagonal);
        
    }
    public static void llenarMatriz(int matriz[][]){
        for(int fila=0;fila<matriz.length;fila++){
            for(int col=0;col<matriz[fila].length;col++){
                if(fila==col){
                    matriz[fila][col]=1;
                }else{
                    matriz[fila][col]=0;
                }
            }
        }
    }
    
    public static void imprimirMatriz(int matriz[][]){
        for(int fila=0;fila<matriz.length;fila++){
            for(int col=0;col<matriz[fila].length;col++){
                System.out.print(matriz[fila][col]);

            }
            System.out.println("");
        }
    }
    
}
