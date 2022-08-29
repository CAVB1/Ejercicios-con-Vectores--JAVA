
package array;

import java.util.*;
public class Ejercicio_9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] dias={"Lunes","Martes","Miercoles","Jueves","Viernes"};
        int[][] temperaturas=new int[5][2];
        introducirTemp(dias, temperaturas);
        System.out.println(menorTemperatura(temperaturas, dias));
        System.out.println(media(temperaturas, dias));
        
        System.out.println("Escribe una temperatura máxima");
        comparacion(temperaturas, sc.nextInt(), dias);
    }
    
    public static void introducirTemp(String cadena[], int e[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<e.length;i++){
            for(int k=0; k<e.length;k++){
                System.out.println("Introduce la temperatura mínima del dia "+cadena[i]);
                e[i][k]=sc.nextInt();                
                System.out.println("Introduce la temperatura máxima del dia "+cadena[i]);
                e[i][k+1]=sc.nextInt();
                
                k+=4;
            }
            
        }
    }
    
    public static void comparacion(int s[][], int e, String cadena[]){
        boolean f=false;
        for(int i=0;i<s.length;i++){
            if(s[i][1]==e){
                System.out.println("Coincide con la temperatura máxima del día "+cadena[i]);
                f=true;
            }
        }
        if(!f){
            System.out.println("Ningún día tiene esa temperatura máxima");
        }
    }
    
    public static String menorTemperatura(int s[][], String cadena[]){
        //String e=Integer.parseInt(s[0][1]);
        int menor=s[0][0],m=s[0][0];
        String dia1="",dia2="";
        for(int i=0;i<s.length;i++){
            if(menor>=s[i][0]){
                
                
                dia1=cadena[i];
                
                menor=s[i][0];
                
            }
        }
        
        for(int i=0;i<s.length;i++){
            if(m>=s[i][0]&&s[i][0]!=menor){ 
                
                    dia2=cadena[i];                
                    m=s[i][0];
                
            }
        }
        return "Los días con menor Temperatura son: "+dia1+" ("+menor+") y "+dia2+" ("+m+")";
    }
    
    public static String media(int s[][], String cadena[]){
        String pr="";
        for(int i=0;i<s.length;i++){
            
               pr+= "La temperatura media del dia "+cadena[i]+" es "+((float)(s[i][0]+(float)s[i][1])/2)+"\n";
            
        }
        return pr;
    }
}
