/*

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.

 */
package ejer7;

import servicio.servicioMetodo;

/**
 
 */
public class Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       servicioMetodo pe1 = new servicioMetodo();
       servicioMetodo pe2 = new servicioMetodo();
       servicioMetodo pe3 = new servicioMetodo();
       servicioMetodo pe4 = new servicioMetodo();
       
        System.out.println("ingrese los datos de la 1° persona");   
       pe1.crearPersona();
        System.out.println(pe1.alcularIMC());
        System.out.println(pe1.esMayorDeEdad());
       
        System.out.println("ingrese los datos de la 2° persona");   
       pe2.crearPersona();
       pe2.alcularIMC();
       pe2.esMayorDeEdad();
       
        System.out.println("ingrese los datos de la 3° persona");   
       pe3.crearPersona();
       pe3.alcularIMC();
       pe3.esMayorDeEdad();
       
        System.out.println("ingrese los datos de la 4° persona");   
       pe4.crearPersona();
       pe4.alcularIMC();
       pe4.esMayorDeEdad();
       
       
    }
    
}
