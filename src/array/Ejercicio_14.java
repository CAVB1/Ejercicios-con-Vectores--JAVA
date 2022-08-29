package array;
import java.util.Scanner;
public class Ejercicio_14 {
    public static void main(String args[]){
        int[][] articulos=new int[5][5];
        int[] totala=new int[5];
        int[] totalS=new int[4];
        llenarDatos(articulos);
        System.out.println(cadaArt(articulos, totala));
        cadaSuc(articulos, totalS);
        System.out.println("La cantidad de articulos en la sucursal 2 es :"+ totalS[1]);
        System.out.println("La cantidad del articulo 3 en la sucursal 1 es "+articulos[2][1]);
        System.out.println(recaudacionIndividual(articulos));
        
    }
    
    public static void llenarDatos(int e[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<e.length;i++){
            System.out.println("Precio del articulo "+(i+1));
            e[i][0]=sc.nextInt();
            
            for(int j=1;j<e.length;j++){                
                System.out.println("Cantidad vendida en la sucursal "+j);
                e[i][j]=sc.nextInt();
            }
        }
    }
    
    public static String cadaArt(int e[][], int s[]){
        String cadena="Total de cada articulo \n";
        for(int i=0;i<e.length;i++){
             for(int j=1;j<e.length;j++){
                 s[i]+=e[i][j];
             }
             cadena+="Artículo "+(i+1)+": "+s[i]+"\n";
        }
        return cadena;
    }
    
    public static void cadaSuc(int e[][], int f[]){
        for(int i=1;i<e.length;i++){
            for(int j=0;j<e.length;j++){
                f[i-1]+=e[j][i];
            }
        }
    }
    
    public static String recaudacionIndividual(int e[][]){
        int rec=0, recaudacion_Total=0;
        String cadena="";
        for(int i=1;i<e.length;i++){
            for(int j=0;j<e.length;j++){
                rec+=e[j][0]*e[j][i];
            }
            recaudacion_Total+=rec;
            cadena+="La recaudación total de la sucursal "+i+" fue de $"+rec+"\n";
        }
        cadena+="La recaudación total de la empresa fue de $"+recaudacion_Total;
        return cadena;
    }
    
    
}
