
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean menu=true;
        int contC=0,contI=0;
        String cadena;
        Scanner leer=new Scanner(System.in);
              
        
        do {
        System.out.println("Dispositivo RS232");
        System.out.println("Escriba la cadena");
        cadena=leer.nextLine();
               
        
        if(cadena.length()==5 && cadena.substring(0,1).equalsIgnoreCase("x")&&cadena.substring(4,5).equalsIgnoreCase("o")){
           System.out.println("Cadena CORRECTA");
            contC=contC+1;
            System.out.println("=================");
           }else if (cadena.equalsIgnoreCase("&&&&&")){
               menu=false;
           }else{
           System.out.println("La Cadena ES INCORRECTA");
           contI=contI+1;
           System.out.println("=================");
            }
        } while (menu==true);
   
        //MENSAJE FINAL
        System.out.println("La cantidad de cadenas CORRECTAS son: "+contC);
        System.out.println("La cantidad de cadenas INCORRECTAS son: "+contI);
         System.out.println("=================");
         System.out.println("PROGRAMA TERMINADO");
         System.out.println("=================");        
        }    
    }