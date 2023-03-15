
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite,num,acum=0;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingresar un límite de suma");
        limite=leer.nextInt();
        System.out.println("Ingresar números enteros");
        do {
            num=leer.nextInt();
            acum=acum+num;
        } while (acum<=limite);
        System.out.println("Llegaste o superaste el límite establecido de "+limite);
        System.out.println("acumulado = "+acum);
        
    }
    
}
