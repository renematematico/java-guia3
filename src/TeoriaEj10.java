
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
public class TeoriaEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingresar 4 valores");
        num=leer.nextInt();
        System.out.print(num+" ");
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        num=leer.nextInt();
        System.out.print(num+" ");
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        num=leer.nextInt();
        System.out.print(num+" ");
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        num=leer.nextInt();
        System.out.print(num+" ");
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
