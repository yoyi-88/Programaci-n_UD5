package Ej_9;

import Ej_3.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona pepe = new Persona("Pepe", "gonzalez", 34);
        Persona mario = new Persona("Mario", "Ramírez", 28);
        Persona enzo = new Persona("enzo", "vaquero", 32);
        Persona izan = new Persona("izan", "ramirez", 23);
        Persona eizan = new Persona("eizan", "romero", 19);
        List<Persona> lista = new ArrayList<>();
        lista.add(pepe);
        lista.add(mario);
        lista.add(enzo);
        lista.add(izan);
        lista.add(eizan);

        System.out.println("Lista actual:");
        for (Persona p : lista) {
            System.out.println(p);
        }

        System.out.println("Crear nueva persona: ");
        System.out.println("Introduzca nombre");
        String nombre = sc.nextLine();

        System.out.println("Introduzca apellido");
        String apellido = sc.nextLine();

        System.out.println("Introduzca edad");
        int edad = sc.nextInt();

        lista.add(new Persona(nombre, apellido, edad));

        System.out.println("Lista actual: ");
        for (Persona p : lista) {
            System.out.println(p);
        }

        System.out.println("Quitar persona");
        System.out.println("Quitar nombre");
        String quitarNombre = sc.nextLine();
        System.out.println("Quitar apellido");
        String quitarApellido = sc.nextLine();
        System.out.println("Quitar edad");
        int quitarEdad = sc.nextInt();
        lista.remove((new Persona(quitarNombre, quitarApellido, quitarEdad)));
        System.out.println("Lista actual: ");
        for (Persona p : lista) {
            System.out.println(p);
        }


        }

    }
