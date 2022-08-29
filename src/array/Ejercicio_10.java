package array;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String args[]){
        int[][] matriz=new int[6][6];
        llenarDatos(matriz);
        sumarDatos(matriz);
        System.out.println(tabla(matriz));
        
    }
    
    public static void llenarDatos(int e[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<e.length-1;i++){                       
            for(int j=0;j<e[0].length-1;j++){                
                System.out.println("Escribe un numero");
                e[i][j]=sc.nextInt();
                e[i][5]+=e[i][j];
                e[5][i]+=e[j][i];
            }
        }
    }
    
     public static void sumarDatos(int e[][]){
        Scanner sc=new Scanner(System.in);
        int sumac=0,sumaf=0;
        for(int i=0; i<e.length-1;i++){                       
            for(int j=0;j<e[0].length-1;j++){                
               
                sumaf+=e[i][j];
                sumac+=e[j][i];
                e[i][5]=sumaf;
                e[5][i]=sumac;
                
                
            }
             sumaf=0;
                sumac=0;
        }
    }
    
    public static String tabla(int e[][]){
        String cadena="";
        for(int i=0; i<e.length;i++){                       
            for(int j=0;j<e.length;j++){                
                cadena+="[ "+e[i][j]+" ]";
            }
            cadena+="\n";
        }
        return cadena;
    }
}
