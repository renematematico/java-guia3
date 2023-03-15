
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
public class TeoriaEjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String respuesta = "S";
        
        /*Este bucle evalúa la condición al comienzo.
        Como viene de antemano "respuesta=s" entra en el bucle
        De lo contrario, pasaría de largo sin ingresar.*/
        while (respuesta.equalsIgnoreCase("S")){
            System.out.println("Desea continuar?");
            respuesta= leer.nextLine();
        }
    }
    
}
