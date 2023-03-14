
package boletin_22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodo {
    
    int maxN = 4;
    
    int t = 1 << (maxN);
    
    Scanner scan = new Scanner(System.in);
    int numEquipos = 20;
    int numJornadas = 36;
    String[] equipos = new String[numEquipos];
    int[][] goles = new int[numEquipos][numJornadas];

    public void ej1(){
        //Meter equipos
        equipos[0] = "Atl";
        equipos[1] = "Madrid";
        equipos[2] = "Celta";
        equipos[3] = "Barça";
        equipos[4] = "a";
        equipos[5] = "b";
        equipos[6] = "c";
        equipos[7] = "d";
        equipos[8] = "e";
        equipos[9] = "f";
        equipos[10] = "g";
        equipos[11] = "h";
        equipos[12] = "i";
        equipos[13] = "j";
        equipos[14] = "k";
        equipos[15] = "l";
        equipos[16] = "m";
        equipos[17] = "n";
        equipos[18] = "o";
        equipos[19] = "p";
        // Meter goles
        for (int i = 0; i < numEquipos; i++) {
            for (int j = 0; j < numJornadas; j++) {
                goles[i][j] =   maxN-((int) (Math.log((Math.random() * t))/Math.log(2)));
            }
        }

        // Imprimir tabla
        System.out.print("E/X\t\t");
        for (int i = 0; i < numJornadas; i++) {
            System.out.print("X" + (i + 1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < numEquipos; i++) {
            System.out.print(equipos[i] + "\t\t");
            for (int j = 0; j < numJornadas; j++) {
                System.out.print(goles[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void ej2(){
        int sum;
        int[] golSum = new int[20];
        for(int i = 0;i<equipos.length;i++){
            sum = 0;
            for(int j = 0;j<goles[i].length;j++){
                sum =sum + goles[i][j];
                golSum[i] = sum;
            }
        }
        for(int i=0;i<golSum.length-1;i++){
            for(int j = i+1; j< golSum.length; j++){
               if(golSum[i] > golSum[j]){
                   int aux = golSum[i];
                   golSum[i] = golSum[j];
                   golSum[j] = aux;
                   String aux2 = equipos[i];
                   equipos[i] = equipos[j];
                   equipos[j] = aux2;
               }
            }
            System.out.println(equipos[i] + " = " + golSum[i]);
        }
    }
    
    public void ej3(){
        int temp = 0;
        int aux = 0; 
        for(int i = 0;i<numJornadas;i++){
            aux = 0; 
            for(int j = 0;j<numEquipos;j++){
               if(goles[j][i] > aux){
                   aux = goles[j][i];
                   temp = j;
               }
            }
            System.out.println("El equipo con mas goles de la jornada " + (i+1) + " es " + equipos[temp] + " con " + aux + " goles.");
        }
    }
    
    public void ej4(){
        int temp = 0;
        int aux = 0; 
        for(int i = 0;i<numJornadas;i++){
            for(int j = 0;j<numEquipos;j++){
               if(goles[j][i] > aux){
                   aux = goles[j][i];
                   temp = j;
               }
            }
        }
        System.out.println("El equipo con mas goles es " + equipos[temp] + " con " + aux + " goles.");
    }
    
    public void ej5(){
        int jor = Integer.parseInt(JOptionPane.showInputDialog("Numero jornada (36)"));
        String eqp = JOptionPane.showInputDialog("Nombre del equipo");
        int aux = 22;
        for(int i = 0;i<equipos.length;i++){
            if(eqp.equals(equipos[i])){
                aux = i;
            }
        }
        if(aux == 22 | jor > 36 | jor < 0){
            int g = goles[aux][jor - 1];
            System.out.println("El equipo " + eqp + " tiene " + g + " goles en la joranada " + jor + ".");
        }
        else{
            System.out.println("Bobolon");
        }
    }
}


