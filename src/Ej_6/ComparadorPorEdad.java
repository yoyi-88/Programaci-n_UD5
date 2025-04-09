package Ej_6;

import Ej_3.Persona;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2){
        if (p1.getEdad() == p2.getEdad()) return 0;
        if (p1.getEdad() > p2.getEdad()) return 1; else return -1;
    }
}
