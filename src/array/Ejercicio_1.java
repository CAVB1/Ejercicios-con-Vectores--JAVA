package array;

import java.util.*;
public class Ejercicio_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vector_numeros[]=new int[10];
        //int vector_numeros[]={4,5,6,2,2,5}; Manera estática de inicializar el vector
        inicializarArreglo(vector_numeros);
        
         for(int i=0; i<vector_numeros.length;i++){
             
            
        }
         
         for(int elemento:vector_numeros){ //for each
             System.out.println("Elemento "+elemento
                                +" Cuadrado "+elemento*elemento);
         }
        
    }
    
    public static void inicializarArreglo(int vector[]){
        for(int i=0; i<vector.length;i++){
            vector[i]=1+(int)(Math.random()*9);
            
        }
    }
    
}
