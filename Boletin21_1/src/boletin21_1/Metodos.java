
package boletin21_1;

public class Metodos {
    
    public int[] createArray(int n){
        int [] randomN = new int[n];
        for(int i=0;i<randomN.length;i++){
            randomN[i]=(int)(49*Math.random())+1;
        }
        return randomN;
    }
    
    public void showArray(int[] array){
        for(int i=array.length-1;i>-1;i--){
            System.out.println(array[i]);
        }
    }
}
