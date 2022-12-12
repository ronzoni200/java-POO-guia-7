
package entidad;

public class persona {
    
    //atributos: nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.

    private String nombre,sexo;
    private int edad;
    private double peso, altura;
    
 //• Un constructor por defecto.
    
      public persona() {
    }   
//• Un constructor con todos los atributos como parámetro.

    public persona(String nombre, String sexo, int edad, int peso, int altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

  //• Métodos getters y setters de cada atributo.  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
