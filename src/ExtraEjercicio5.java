
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
public class ExtraEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String tipoSocio;
        double monto;
        boolean socio;
        
        //Primer mensaje al usuario
        do {
            System.out.println("============================");
            System.out.println("Ingrese el tipo suscripción");
            System.out.println("============================");
        tipoSocio=leer.nextLine();
        tipoSocio=tipoSocio.toUpperCase();
        
//Creo una variable que controle si el valor ingresado es correcto        
        socio = tipoSocio.equalsIgnoreCase("A") || tipoSocio.equalsIgnoreCase("B")|| tipoSocio.equalsIgnoreCase("C");
        } while (socio==false);
        
        
        
        //Segundo mensaje al usuario
        System.out.println("================================");
        System.out.println("Ingrese el valor del tratamiento");
        System.out.println("================================");
        monto=leer.nextDouble();
        
        switch (tipoSocio){
            case ("A"): System.out.println(
                    "Su descuento es del 50%. Debe abonar $ "+monto*0.5);
                break;
            case ("B"):System.out.println(
                    "Su descuento es del 35%. Debe abonar $ "+monto*0.65);
                break;
            case ("C"):System.out.println(
                    "Su plan no tiene descuento. Debe abonar $ "+monto);
                break;
        }
    }
    
}
