package array;

import java.util.*;
public class Ejercicio_13 {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuántos conductores son?");
        int lon=sc.nextInt();
        String[] nombres=new String[lon];
        int[][] kms=new int[lon][7];
        int[] total_kms=new int[lon];
        llenarDatos(nombres, kms);
        totalKms(kms, total_kms);
        System.out.println(datos(nombres, total_kms));
    }
    public static void llenarDatos(String s[], int a[][]){
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<s.length;i++){
            System.out.println("Escribe el nombre del conductor "+(i+1));
                s[i]=sc.nextLine();
                if(i>0){
                   s[i]=sc.nextLine();
 
                }
            for(int j=0;j<a[0].length;j++){
                System.out.println("Kilometros conducidos del diá "+(j+1));
                a[i][j]=sc.nextInt();
            }
        }   
        
    }
    
    public static void totalKms(int e[][], int a[]){
        for(int i=0;i<e.length;i++){
            for(int j=0;j<e[0].length;j++){
                a[i]+=e[i][j];
            }
        }
    }

    
    public static String datos(String s[], int a[]) {
        String cadena="Kilometros totales por conductor \n";
        for(int i=0;i<s.length;i++){
            cadena+=s[i]+": "+a[i]+" kilometros \n";
        }
        return cadena;
    }
    
    
    
    
}
