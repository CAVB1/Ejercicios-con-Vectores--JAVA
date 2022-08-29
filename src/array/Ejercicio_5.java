package array;

public class Ejercicio_5 {
    public static void main(String args[]){
        int[] vector=new int[10];
        llenarVector(vector);
        ordenarVector(vector);
        for(int si:vector){
            System.out.println(si);
        }
    }
    
    public static void llenarVector(int e[]){
         for(int i=0; i<e.length;i++){
            e[i]=(int)(Math.random()*1000);
            
        }
    }
    
    public static void ordenarVector(int e[]){
         int t;
        for(int i=0;i<=e.length-1;i++){
            for(int j=0;j<=e.length-1;j++){
                if(e[i]<e[j]){
                    t=e[i];
                    e[i]=e[j];
                    e[j]=t;
                }
            }
        }
    }
    
}
