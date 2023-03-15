
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
public class TeoriaEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numA,numB;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el valor A");
        numA = leer.nextInt();
        numB = leer.nextInt();
        
        if (numA > 25 && numB >25){
            System.out.println("Ambos números son mayores a 25");
        }else if (numA>25) {
            System.out.println("Solamente el primer número es mayor a 25");
        } else if (numB>25) {
            System.out.println("Solamente el segundo números es mayor a 25");
        } else {
            System.out.println("Ninguno de los valores ingresados es mayor a 25");
        }
        
        
    }
    
}
