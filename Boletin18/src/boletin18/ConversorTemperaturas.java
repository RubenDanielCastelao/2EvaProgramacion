
package boletin18;

public class ConversorTemperaturas {
    private final float gradosLimite = 80f;
    public float centigradosAFharenheit(float temp) throws ExcepcionErrorTemperatura{
        if(temp < gradosLimite){
            throw new ExcepcionErrorTemperatura();
        }
        else{
            float fharenheit = 9.0f / 5.0f * temp + 32.4f;
            System.out.println("Fharenheit: " + fharenheit);
            return fharenheit;
        }
    }
    public void centigradosAReamur(float temp) throws ExcepcionErrorTemperatura{
        if(temp < gradosLimite){
            throw new ExcepcionErrorTemperatura("ERROR in temp < 80");
        }
        else{
            float reamur = 4.0f / 5.0f * temp;
            System.out.println("Reamur: " + reamur);
        }
    }
}
