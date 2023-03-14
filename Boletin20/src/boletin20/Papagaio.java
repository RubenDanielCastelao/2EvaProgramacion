
package boletin20;

public class Papagaio extends Aves implements IPodeVolar, IPodeCamiñar{
    public void camiñar(){
        System.out.print("Os papagaios poden camiñar");
    }
    public void voar(){
        System.out.println(" e tamen poden volar\n");
    }
}
