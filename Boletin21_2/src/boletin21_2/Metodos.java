
package boletin21_2;

import javax.swing.JOptionPane;

public class Metodos {
    
    public int[] createArray(int n){
        int [] alumnos = new int[n];
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota n" + i));
        }
        return alumnos;
    }
    
    public void showApSus (int [] notas){
        int ap = 0;
        int sus = 0;
        for(int i=0;i<notas.length;i++){
            if(notas[i] > 4.99){
                ap ++;
            }
            else{
                sus++;
            }
        }
        System.out.println("Aprobados: " + ap + "\nSuspensos: " + sus);
    }
    
    public void calcMedia(int[] notas){
        int total = 0;
        for(int i=0;i<notas.length;i++){
            total = total + notas[i];
        }
        int media = total / notas.length;
        System.out.println("La media es: " + media);
    }
    
    public void notaMasAlta (int[] notas){
        int temp = 0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>temp){
                temp = notas[i];
            }
        }
        System.out.println("La nota mas alta es: " + temp);
    }
}
