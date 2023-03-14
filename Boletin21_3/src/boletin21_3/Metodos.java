
package boletin21_3;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Metodos {
    int ap = 0;
    int sus = 0;
    
    
    public int[] createArray(int n){
        int [] alumnos = new int[n];
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota nº" + i));
        }
        return alumnos;
    }
        
    public String[] createArrayNome(int n){
        String [] alumnos = new String[n];
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=JOptionPane.showInputDialog("Introduzca el nombre nº" + i);
        }
        return alumnos;
    }
    
    public void showApSus (int [] notas){
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
    
    public void mostrarNota (int [] notas,int n){
        System.out.println("La nota del alumno " + n + "es: " + notas[n]);
    }
    
    public void listaAprobados (String [] nombres, int [] notas){
       for(int i=0;i<notas.length;i++){ 
        if(notas[i] >= 5){
            System.out.println(nombres[i]);
        }
      }     
    }
    
    public void ordenarNotas (int [] notas){
        Arrays.sort(notas);
        for(int i=0;i<notas.length;i++){
            System.out.println(i + "-." + notas);
        }
    }
    
    public void notaAlumno (int [] notas, String [] nombre,String nom){
        for(int i=0;i<nombre.length;i++){
            if(nom == nombre[i]){
                System.out.println("La nota del alumno es: " + notas[i]);
            }
        }
    }
}


