
package array;
public class Ejercicio_12 {
    public static void main(String args[]){
        int [][] marco=new int[5][15];
        llenarMarco(marco);
        System.out.println(printMarco(marco));
    }
    
    public static void llenarMarco(int e[][]){
        for(int i=0;i<e.length;i++){
            for(int j=0;j<e[0].length;j++){
                if(i==0||i==e.length-1||j==0||j==e[0].length-1){
                    e[i][j]=1;
                }else{
                    e[i][j]=0;
                }
            }
        }
    }
    
    public static String printMarco(int e[][]){
        String cadena="";
        for(int i=0;i<e.length;i++){
            for(int j=0;j<e[0].length;j++){
                cadena+=e[i][j];
            }
            cadena+="\n";
        }
        return cadena;
    }
}
