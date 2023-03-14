package boletin_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.billy.data.getters;

public class Metodos {

    public ArrayList<Libro> engadir(ArrayList<Libro>lista){
        Libro lib = new Libro(getters.getString("titulo: "),getters.getString("autor: "),getters.getString("ISBN: "),getters.getFloat("prezo: "),getters.getInt("unidades: "));
        lista.add(lib);
        return lista;
    }
    public void amosar(ArrayList<Libro>lista) throws ExcepcionLibro{
        if(lista.isEmpty()==true){
            throw new ExcepcionLibro();
        }
        Collections.sort(lista);
        Iterator it= lista.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
        }
    }
    public void vender(ArrayList<Libro>lista) throws ExcepcionLibro{
        if(lista.isEmpty()==true){
            throw new ExcepcionLibro();
        }
        String tituloBorrar= getters.getString(" Introduce o titulo do libro a vender: ");
        Iterator it= lista.iterator();
        Libro lib;
        while(it.hasNext()){
            lib=(Libro)it.next();
            if(lib.getTitulo().equalsIgnoreCase(tituloBorrar))
                lib.setUnidades(lib.getUnidades()-1);
        }
        }
    
    public void actualizar(ArrayList<Libro>lista) throws ExcepcionLibro{
       if(lista.isEmpty()==true){
            throw new ExcepcionLibro();
       }
       Iterator itr = lista.iterator();
       Libro lib = null;
       while(itr.hasNext()){
           lib=(Libro)itr.next();
           if(lib.getUnidades()==0)
               itr.remove();         
    }
}
    public void consultar(ArrayList<Libro>lista) throws ExcepcionLibro{
        if(lista.isEmpty()==true){
            throw new ExcepcionLibro();
        }
        String srch = getters.getString("Que libro se desea consultar?");
        for(Libro elemento:lista){
            if(srch.equalsIgnoreCase(elemento.getTitulo())){
                System.out.println(elemento.toString());
            }
            else{
                System.out.println("El libro no esta en la lista.");
            }
        }
    }
}
