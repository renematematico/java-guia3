
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
public class TeoriaEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int nota=-1;
        
        while (nota<0 || nota >10){
        System.out.println("Ingrese un valor desde 0 a 10");
        nota=leer.nextInt();
        }
    }
    
}
