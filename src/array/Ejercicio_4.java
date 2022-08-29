package array;
import java.util.*;
public class Ejercicio_4 {
    public static void main(String args[]){
        int[] vector=new int[10];
        
        llenarVector(vector);
        for(int v:vector){
            if(v!=0){
                System.out.println(v);
            }
        }
        
    }
    
    public static void llenarVector(int e[]){
        Scanner sc=new Scanner(System.in);
        int s=e.length;
        for(int i=0;i<=e.length-1;i++){
            System.out.println("Escribe un numero para la pocisión: "+(i+1));
            e[i]=sc.nextInt();
            if(e[i]<0){
                e[i]=0;
                s=i+1;
                i=e.length;               
            }
            
        }      
    }
    
}
