
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
public class ExtraEjercicio1 {
    /*Dado un tiempo en minutos, calcular su equivalente 
    en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, 
    el sistema debe calcular su equivalente: 1 día, 2 horas.*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,dias,horas;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un valor en minutos.");      
        num=leer.nextInt();        
        
        dias = (int) Math.floor(num/1440);
        horas= (int) Math.floor((num-dias*1440)/60);
        
        System.out.println("El valor ingresado equivale a "+dias+" días y "+horas+" horas.");
        
        
    }
    
}
