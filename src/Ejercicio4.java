
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos las variables
        String frase;
        Scanner leer=new Scanner(System.in);
        
        
        System.out.println("Ingresar una frase.");
        frase=leer.nextLine();
        
        if(frase.substring(0,1).equalsIgnoreCase("A")){
            System.out.println("CORRECTO. La palabra comienza con A");
        }else{
            System.out.println("INCORRECTO. La frase no comienza con A");
        }
        
        // Lo usé para revisar los caracteres de la subcadena
        System.out.println(frase.substring(0,4));
        
    }
    
}
