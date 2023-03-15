
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
public class Ejercicio3 {
    /*Realizar un programa que solo permita introducir 
    solo frases o palabras de 8 de largo. Si el usuario 
    ingresa una frase o palabra de 8 de largo se deberá
    de imprimir un mensaje por pantalla que diga “CORRECTO”,
    en caso contrario, se deberá imprimir “INCORRECTO”. 
    Nota: investigar la función Lenght() en Java.*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingresar una palabra de 8 caracteres");
        palabra=leer.nextLine();
                
        if(palabra.length()==8){
            System.out.println("La palabra tiene 8 caracteres");
        }else{
            System.out.println("La cantidad de caracteres es distinto a 8");
        }
    }
    
}
