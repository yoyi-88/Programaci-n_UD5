package Ejemplos;

abstract class Animal {
        protected String nombre;
        protected int edad;

        Animal(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + "/Edad: " + edad);
        }
        public abstract String moverse();

        public abstract void hacersonido();
}
