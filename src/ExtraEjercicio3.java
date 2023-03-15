
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class ExtraEjercicio3 {
    /*Elaborar un algoritmo en el cuál se ingrese una letra 
    y se detecte si se trata de una vocal. Caso contrario 
    mostrar un mensaje. Nota: investigar la función equals() de 
    la clase String.
*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String letra;
        String vocales="aeiou";
        Scanner leer=new Scanner(System.in);
        boolean encontrado=false;
        
        do {
            System.out.println("Ingresar una letra");
        letra = leer.nextLine();
        } while (letra.length()>1);
        
        for (int i = 0; i < 5; i++) {
            if (letra.equalsIgnoreCase(vocales.substring(i,i))){
                encontrado=true;
                break;
            }else{
                encontrado=false;
            }
        }
        if(encontrado==true){
        System.out.println("La letra ingresada ES una VOCAL");
        }else{
        System.out.println("La letra ingresada NO ES VOCAL");
        }
    }
    
}
