
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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese un número entero");
        num = leer.nextInt();
        if (num %2==0){
            System.out.println("El valor ingresado es un número PAR");
        }else{
            System.out.println("El valor ingresado es IMPAR.");}
    }
    
}
