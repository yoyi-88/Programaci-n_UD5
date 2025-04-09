package Ej_6;

import Ej_3.Persona;

import java.util.Comparator;

public class ComparadorPorApellidos implements Comparator<Persona>{
    @Override
    public int compare(Persona o1, Persona o2){
        return (o1.getApellidos().compareTo(o2.getApellidos()));
    }
}
