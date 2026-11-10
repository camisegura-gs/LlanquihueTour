package app;

import model.Direccion;
import model.GuiaTuristico;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN - LLANQUIHUE TOUR ===");
        System.out.println();

        // Crear instancias de Direccion (Composición)
        Direccion dir1 = new Direccion("Calle Techada 123", "Llanquihue", "de Los Lagos");
        Direccion dir2 = new Direccion("Costanera 456", "Puerto Varas", "de Los Lagos");
        Direccion dir3 = new Direccion("Avenida Vicente Pérez Rosales 789", "Ensenada", "de Los Lagos");

        // Crear instancias de Persona y GuiaTuristico
        Persona persona1 = new Persona("18234567-8", "Carlos Soto", 30, dir1);

        GuiaTuristico guia1 = new GuiaTuristico(
                "15987654-3",
                "María Valenzuela",
                28,
                dir2,
                "Rutas Gastronómicas y Lacustres",
                5
        );

        GuiaTuristico guia2 = new GuiaTuristico(
                "12456789-K",
                "Esteban Roa",
                35,
                dir3,
                "Excursiones de Montaña y Trekking",
                8
        );

        // Mostrar por consola los datos utilizando toString()
        System.out.println("--- Listado de Registros en el Sistema ---");
        System.out.println(persona1);
        System.out.println(guia1);
        System.out.println(guia2);
    }
}