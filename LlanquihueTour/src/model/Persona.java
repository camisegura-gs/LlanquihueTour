package model;

public class Persona {
    private String rut;
    private String nombre;
    private int edad;
    private Direccion direccion; // Composición: una Persona "tiene una" Direccion

    // Constructor vacío
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(String rut, String nombre, int edad, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Edad: " + edad + " | Dirección: " + direccion;
    }
}