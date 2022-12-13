/*
. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.
 */
package ejer10.Servicios;

public class serviciosEntidades10 {

    double[] vec1 = new double[50];
    double[] vec2 = new double[20];
    double aux = 0;

    public void inicio() {

        for (int i = 0; i < 50; i++) {
            vec1[i] = Math.round(Math.random() * 99);
        }

        for (int j = 0; j < 50; j++) {

            for (int i = 0; i < 50 - 1; i++) {

                if (vec1[i] > vec1[i + 1]) {
                    aux = vec1[i];
                    vec1[i] = vec1[i + 1];
                    vec1[i + 1] = aux;
                }
            }
        }
        
        for (int k = 0; k < 50; k++) {
            System.out.println(vec1[k]+" ");
        }
        for (int i = 0; i < 20; i++) {
            if(i<10){
            vec2[i]=vec1[i];
            }
            if(i>=10){
                vec2[i]=0.5;
            }
        }
        System.out.println(" -------- ");
        
        for (int i = 0; i < 20; i++) {
            System.out.println(vec2[i]);
        }
    }

}
