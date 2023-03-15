
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
public class TeoriaEjemploDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        String respuesta;
    
        // Este bucle evalúa la condición al final.
        do{
            System.out.println("Desea continuar?");
            respuesta=leer.nextLine();
        }while(respuesta.equalsIgnoreCase("S"));
    
    
    }
    
    
}
