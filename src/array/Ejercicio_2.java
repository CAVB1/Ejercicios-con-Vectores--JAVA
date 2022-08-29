package array;
import java.util.*;
public class Ejercicio_2 {
   
    
    public static void main(String args[]){
         
        String[] cadena=new String[5];
        String[] cadena2=new String[5];
        leerVector(cadena);
        invertirOrden(cadena, cadena2);
        for(String pos:cadena2){
            System.out.println(pos);
        }
        
       
    }
    
    public static void leerVector(String c[]){
        Scanner sc=new Scanner(System.in);
        int a=0;
         do{
            System.out.println("Escribe una cadena para la posición "+a+" del vector");
            c[a]=sc.nextLine();
            a++;
        }while(a<c.length);
    }
    
    public static void invertirOrden(String c[], String w[]){
        int a=0;
        for(int i=c.length-1; i>=0;i--){
            w[a]=c[i];
            a++;
        }
    }
}
