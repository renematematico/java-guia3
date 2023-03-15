
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
public class ExtraEjercicio2 {
    /*Declarar cuatro variables de tipo entero A, B, C y D y 
    asignarle un valor diferente a cada una. A continuación, 
    realizar las instrucciones necesarias para que: B tome el 
    valor de C, C tome el valor de A, A tome el valor de D 
    y D tome el valor de B. Mostrar los valores iniciales y 
    los valores finales de cada variable. Utilizar sólo una 
    variable auxiliar.
*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numA,numB,numC,numD,aux;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresar 4 valores");
        numA=leer.nextInt();
        numB=leer.nextInt();
        numC=leer.nextInt();
        numD=leer.nextInt();
        
        
        System.out.println("==========================");
        System.out.println("Los Valores ingresados son: ");
        System.out.println("numA = "+numA);
        System.out.println("numB = "+numB);
        System.out.println("numC = "+numC);
        System.out.println("numD = "+numD);
        System.out.println("==========================");
        aux=numB;
        numB=numC;
        numC=numA;
        numA=numD;
        numD=aux;
        System.out.println("Los Valores luego de los cambios quedarían: ");
        System.out.println("numA = "+numA);
        System.out.println("numB = "+numB);
        System.out.println("numC = "+numC);
        System.out.println("numD = "+numD);
        
    }
    
}
