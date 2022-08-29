
package array;
import java.util.Scanner;
public class Ejercicio_6 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] vector={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Escribe el número de un més");
        int mes=sc.nextInt();
        System.out.println("El mes "+mes+" tiene "+vector[mes-1]+" dias");
        
    }
    
}
