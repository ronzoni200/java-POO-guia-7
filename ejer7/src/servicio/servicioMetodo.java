/*



 */
package servicio;

import entidad.persona;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


/**
 *
 * @author gusta
 */
public class servicioMetodo {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    persona p1 = new persona();
//    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
//Si no es correcto se deberá mostrar un mensaje
    
    public void crearPersona(){
     
        System.out.println("ingre nombre");
        p1.setNombre(sc.nextLine());
        System.out.println("ingrese su edad");
        p1.setEdad(sc.nextInt());
        System.out.println("ingrese su peso");
        p1.setPeso(sc.nextDouble());
        System.out.println("ingrese su altura");
        p1.setAltura(sc.nextDouble());
        
        System.out.println("ingrese sexo presionando: \n"
                + "h = HOMBRE\n"
                + "m = MUJER\n"
                + "o = OTROS");
        
        p1.setSexo(sc.next());
        
        if("h".equals(p1.getSexo())){
            p1.setSexo("HOMBRE");
    }
        if("m".equals(p1.getSexo())){
            p1.setSexo("MUJER");
        }

        if("o".equals(p1.getSexo())){
            p1.setSexo("OTRO");
            
    }
        System.out.println(p1.getSexo());
}
    
 /*   • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
*/
    
    public int alcularIMC(){
        int cuadrado=2, resultado = 0;
        double formula;
        
        formula= (p1.getPeso()/Math.pow((p1.getAltura()), cuadrado));
        Math.round(formula);
        
        
        if(formula<20){
            resultado=-1;
            System.out.println("usted esta por debajo de su peso idea");
        }
        if(formula>=20 && formula<= 25){
            resultado=0;
            System.out.println("usted esta en su peso idea");
        }
        if(formula>25){
            resultado=1;
            System.out.println("usted esta por ensima de su peso idea");
        }
       // System.out.println(resultado);
        return resultado;
        
    }
    
    
/*• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
*/
    
  public boolean esMayorDeEdad(){
      
      boolean out = false;
      
      if(p1.getEdad()<18){
      out = false;}
      if(p1.getEdad()>18){
          out = true;}
    
      return out;
  }
      
      
  }
