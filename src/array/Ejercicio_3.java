
package array;
import java.util.*;

public class Ejercicio_3 {
    public static void main(String args[]){
        float[] notas=new float[5];
        System.out.println(notas.length);
        llenarMatriz(notas);
        ordenar(notas);
        System.out.println("La nota más alta es "+notaMayor(notas));
        System.out.println("La nota más baja es "+notaMenor(notas));
        System.out.println("La nota media es "+notaMedia(notas));
        System.out.println("El promedio es: "+promedio(notas));
        
       
    }
    
    public static void llenarMatriz(float f[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=f.length-1;i++){
            System.out.println("Escribe la nota "+(i+1)+" del alumno");
            f[i]=sc.nextFloat();
        }
    }
    public static float notaMayor(float g[]){
        float numeroMayor=g[0];
        
        for(int i=0; i<=g.length-1;i++){
           if(numeroMayor>g[i]){
               
           }else{
               numeroMayor=g[i];
           }         
        }
        return numeroMayor;
    }
    
    public static float notaMenor(float g[]){
        float numeroMenor=g[0];
        
        for(int i=0; i<=g.length-1;i++){
           if(numeroMenor<g[i]){
               
           }else{
               numeroMenor=g[i];
           }         
        }
        return numeroMenor;
    }
    
    public static void ordenar(float r[]){
        float t;
        for(int i=0;i<=r.length-1;i++){
            for(int j=0;j<=r.length-1;j++){
                if(r[i]<r[j]){
                    t=r[i];
                    r[i]=r[j];
                    r[j]=t;
                }
            }
        }
    }
    
    public static float notaMedia(float r[]){
        int m=r.length/2; 
        float media=0;
        if(r.length%2==0){
            media=(r[m]+r[m+1])/2;
             
        }else{
            media=r[m];
        }
        return media;
    }
    
    public static float promedio(float h[]){
        float suma=0;
        for(int i=0;i<=h.length-1;i++){
            suma+=h[i];
        }
        return suma/h.length;
    }
}

