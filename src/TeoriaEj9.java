
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
public class TeoriaEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int acum=0;
        int i=0;
        int num;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar 20 números a sumar.");
        
        do{
            System.out.println("Ingresar el Nº"+(20-i));
            num=leer.nextInt();
            if (num>0) {
            acum=acum+num;
            }
            i=i+1;
            if (num==0){
                break;
            }
        }while(i<20);
        System.out.println("La suma de todos los números ingresados es "+acum);
        }   
}
