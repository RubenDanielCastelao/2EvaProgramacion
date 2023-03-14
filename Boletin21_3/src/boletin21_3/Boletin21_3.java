
package boletin21_3;

public class Boletin21_3 {

        public static void main(String[] args) {
        Metodos obx = new Metodos();
        int [] array1 = obx.createArray(30);
        String [] array2 = obx.createArrayNome(30);
        obx.showApSus(array1);
        obx.calcMedia(array1);
        obx.notaMasAlta(array1);
        obx.mostrarNota(array1, 6);
        obx.listaAprobados(array2, array1);
        obx.ordenarNotas(array1);
        obx.notaAlumno(array1, array2, "Alberto");
    }
    
}
