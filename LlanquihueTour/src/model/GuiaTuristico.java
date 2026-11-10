package model;

public class GuiaTuristico extends Persona {
    private String especialidad;
    private int añosExperiencia;

    // Constructor vacío
    public GuiaTuristico() {
        super();
    }

    // Constructor con parámetros
    public GuiaTuristico(String rut, String nombre, int edad, Direccion direccion, String especialidad, int añosExperiencia) {
        super(rut, nombre, edad, direccion);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + " | Especialidad: " + especialidad + " | Experiencia: " + añosExperiencia + " años";
    }
}