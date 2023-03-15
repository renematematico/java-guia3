
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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos las variables
        int num;
        Scanner leer=new Scanner (System.in);
        
        //Mensaje para el usuario y lectura de número
        System.out.println("Ingresar un número mayor a 2 y menor a 10");
        num=leer.nextInt();
        
        //bucle, cada i representa una línea
        for (int i = 1; i <= num; i++) {
            
            //La primera y la última se llenan completas
            if(i==1 || i==num){
            for (int j = 1; j <= num; j++) {
                System.out.print("*");          
            }}
            
            /*Si no es la primera o la última línea
            Se llenará solamente la primera columna y la última.*/
            if(i!=1 && i!=num){
            System.out.print("*");
                for (int j = 1; j <= (num-2); j++) {
                System.out.print(" ");        
                }
            System.out.print("*");
            }
            System.out.println("");
        }        
        
            
        
    }
    
}
