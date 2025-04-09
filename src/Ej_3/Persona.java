
package Ej_3;

import java.util.Objects;

import Ej_3.Sexo;

/**
 * @author Fran Gómez
 */
public class Persona implements Comparable<Persona> {
    // Atributos
    protected String nombre;
    protected String apellidos;
    protected Integer edad;
    protected double estatura;
    protected Sexo sexo;

    // Métodos


    /**
     * Constructor con parámetros
     *
     * @param nombre
     * @param edad
     * @param estatura
     */
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    Persona (String nombre) {
        this.nombre = nombre;
    }

    public Persona() {

    }

    public Persona(String nombre, int edad) {
        this(nombre);
        this.edad = edad;
    }

    /**
     * Constructor copia
     * @param persona
     */
    public Persona (Persona persona) {
        this.nombre = persona.nombre;
        this.edad = persona.edad;
        this.estatura = persona.estatura;
        this.sexo = persona.sexo;
    }

    void mostrarDatos() {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(estatura);
    }

    void metodo() {
        int edad = 8;
        System.out.println(this.edad);
    }
    void saludar () {
        System.out.println("Hola soy " + nombre);
    }
    void cumplirAnyos() {
        edad ++;
    }
    void crecer (double incremento) {
        estatura = estatura + incremento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", sexo=" + sexo + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        Persona other = (Persona) obj;
        return edad == other.edad && Double.doubleToLongBits(estatura) == Double.doubleToLongBits(other.estatura)
                && Objects.equals(nombre, other.nombre) && sexo == other.sexo;
    }


    // Ejercicio 5
    @Override
    /*public int compareTo(Persona otraPersona) {
        return this.nombre.compareTo(otraPersona.nombre);
    }*/

   /* public int compareTo(Persona o){
        return this.edad.compareTo(o.edad);
    }*/

    public int compareTo(Persona o){
        int resultado;
        if (this.nombre != o.nombre){
            resultado = this.nombre.compareTo(o.nombre);
        }else{
            resultado = this.edad.compareTo(o.edad);
        }
        return resultado;
    }
}
