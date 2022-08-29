
package array;
import java.util.*;

public class Ejercicio_8 {
    public static void main(String args[]){
        String[] nombres=new String[50];
        int [] edades=new int[50];
        llenarDatos(nombres, edades);
        System.out.println(mayoriaEdad(nombres, edades));
        System.out.println(mayores(nombres, edades));
        
    }
    
    public static void llenarDatos(String s[], int a[]){
        Scanner sc=new Scanner(System.in);
        int i=0;
        do{
            
            System.out.println("Escribe el nombre del alumno");
            s[i]=sc.nextLine();
            if(i>0){
                s[i]=sc.nextLine();
            }
            
            if(s[i].equals("*")){
                s[i]="";
                a[i]=0;
                i=s.length;
            }else{
                System.out.println("Escribe la edad del alumno");
                a[i]=sc.nextInt();
            }
            i++;
        }while(i<s.length);
    }
    
    public static String mayoriaEdad(String s[], int a[]){
        String cadena="Alumnos mayores de edad \n";
        for(int i=0;i<s.length;i++){
            if(a[i]>=18){
                cadena+=s[i]+": "+a[i]+" años \n";
            }
        }
        return cadena;
    }
    
    public static String mayores(String s[], int a[]){
        int mayor=0, m2=0,m3=0;
        for(int i=0;i<a.length;i++){
            if(a[mayor]<a[i]&&i!=mayor){
                
                mayor=i;
            }
        }
        
        if(mayor<s.length-1){
            m3=mayor+1;
            for(int i=mayor+1;i<s.length;i++){
                if(a[m3]<a[i]){
                    m3=i;
                }
            }
        }
        if(m3>m2){
            m2=m3;
        }
        
        return "Los alumnos más grandes son "+s[mayor]+" con "+a[mayor]+ " y "+s[m2]+" con "+a[m2];
    }
}
