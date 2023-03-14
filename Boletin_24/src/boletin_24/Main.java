package boletin_24;

import com.billy.data.getters;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Libro> listaXog= new ArrayList<>();
        Metodos obx=new Metodos();
        int op = 0;
        
        do{
            try{
            op= getters.getInt("**** MENU **** \n 1--> ENGADIR LIBRO \n 2--> AMOSAR \n 3-->VENDER \n 4--> ACTUALIZAR \n 5--> CONSULTAR   \nteclea una opcion : ");
            switch(op){
                case 1:obx.engadir(listaXog);
                    break;
                case 2:obx.amosar(listaXog);
                    break;
                case 3:obx.vender(listaXog);
                    break;
                case 4:
                    obx.actualizar(listaXog);
                    break;
                case 5:
                    obx.consultar(listaXog);
                    break;

                default: System.out.println(" OPCION INCORRECTA ");

            }
        }catch(ExcepcionLibro ex){
                    System.out.println("ERROR");
                }
        }while(op<=5);
    }
}