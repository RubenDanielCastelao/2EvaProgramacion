
package boletin18;

import javax.swing.JOptionPane;

public class Boletin18 {
    
    public static void main(String[] args) {
        ConversorTemperaturas convTemp = new ConversorTemperaturas();
        try{
            float temp = Float.parseFloat(JOptionPane.showInputDialog("Temperatura en Celsius"));
            convTemp.centigradosAFharenheit(temp);
            convTemp.centigradosAReamur(temp);
        }catch(ExcepcionErrorTemperatura e){
            System.out.println("ERROR: " + e.toString());
        }
        System.out.println("Fin del programa");
    }
}
     