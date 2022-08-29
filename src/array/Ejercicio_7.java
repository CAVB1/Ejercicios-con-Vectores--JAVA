/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author ville
 */
public class Ejercicio_7 {
    public static void main(String Args[]){
        int[] vector1=new int[5];
        int[] vector2=new int[5];
        int[] vector3=new int[5];
        System.out.println("Ingrese los datos para el vector 1");
        llenarVector(vector1);
        System.out.println("Ingrese los datos para el vector 2");
        llenarVector(vector2);
        sumaVector(vector1, vector2, vector3);
        System.out.println("\nDatos del vector 3");
        for(int v:vector3){
            System.out.print("[ " +v+" ] ");
        }
        
        
        
    }
     public static void llenarVector(int f[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=f.length-1;i++){
            System.out.println("Escribe un número entero");
            f[i]=sc.nextInt();
        }
    }
     
     public static void sumaVector(int a[], int b[], int c[]){
         for(int i=0;i<=c.length-1;i++){
             c[i]=a[i]+b[i];
         }
     }
    
}
