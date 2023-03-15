
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
public class Ejercicio2 {
    /*Crear un programa que pida una frase y si esa frase 
    es igual a “eureka” el programa pondrá un mensaje de 
    Correcto, sino mostrará un mensaje de Incorrecto. 
    Nota: investigar la función equals() en Java.
*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingresar la palabra secreta");
        palabra=leer.nextLine();
        if(palabra.equalsIgnoreCase("eureka")){
            System.out.println("La palabra ingresada es EUREKA");
        }else{
            System.out.println("La palabra ingresada NO ES LA ESPERADA");
        }
    }
    
}
