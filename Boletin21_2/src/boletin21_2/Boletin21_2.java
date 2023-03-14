
package boletin21_2;

public class Boletin21_2 {

    public static void main(String[] args) {
        Metodos obx = new Metodos();
        int [] array1 = obx.createArray(30);
        obx.showApSus(array1);
        obx.calcMedia(array1);
        obx.notaMasAlta(array1);
    }
    
}
