package boletin_24;

import java.util.Collections;

public class Libro implements Comparable {
    private String titulo;

    private String autor;

    private String ISBN;

    private float prezo;

    private int unidades;

    public Libro(String titulo, String autor, String ISBN, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return
                " titulo=" + titulo +
                        " autor=" + autor +
                        " ISBN=" + ISBN +
                        " prezo=" + prezo+
        " unidades=" + unidades
        ;
    }

    public int compareTo(Object o) {
        Libro x=(Libro) o;
        if(this.titulo.compareToIgnoreCase(x.titulo)>0)
            return 1;
        else if(this.titulo.compareToIgnoreCase(x.titulo)<0)
            return -1;
        else
            return 0;

    }
}
