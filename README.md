# Llanquihue Tour - Sistema de Gestión Orientado a Objetos

## Propósito del Proyecto
Sistema desarrollado para la agencia de turismo **Llanquihue Tour** ubicado en la Región de Los Lagos. Su objetivo es digitalizar y estructurar la información de las personas vinculadas a la empresa (como clientes y guías turísticos), aplicando principios de la Programación Orientada a Objetos (POO) tales como encapsulamiento, herencia y composición.

## Estructura de Paquetes y Clases
El proyecto está organizado en dos paquetes principales:
- **`model`**: Contiene las clases del dominio del negocio.
  - `Direccion.java`: Clase que almacena la información geográfica (calle, ciudad, región) aplicando composición.
  - `Persona.java`: Clase base que encapsula los atributos comunes de una persona (rut, nombre, edad) y contiene una instancia de `Direccion`.
  - `GuiaTuristico.java`: Subclase que hereda de `Persona` e incorpora atributos específicos como especialidad y años de experiencia.
- **`app`**: Contiene la lógica de ejecución.
  - `Main.java`: Clase principal que instancia los objetos y muestra la información por consola utilizando `toString()`.

## Instrucciones para Compilar y Ejecutar
1. Clona o descarga este repositorio en tu equipo.
2. Abre el proyecto en **IntelliJ IDEA**.
3. Asegúrate de configurar correctamente el JDK de Java.
4. Navega hasta el archivo `Main.java` ubicado dentro del paquete `app`.
5. Ejecuta el método `main` haciendo clic en el ícono de reproducción (Play) en IntelliJ IDEA para visualizar los resultados en la consola.
