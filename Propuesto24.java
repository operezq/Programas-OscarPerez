/* Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es 
la esfera de mayor peso. */

package poo.propuesto24;
import java.util.Scanner;
public class Propuesto24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A,B,C;
        System.out.print("Ingrese el peso de la esfera A: ");
        A = entrada.nextInt();
        System.out.print("Ingrese el peso de la esfera B: ");
        B = entrada.nextInt();
        System.out.print("Ingrese el peso de la esfera C: ");
        C = entrada.nextInt();
        if (A > B && A > C){
            System.out.println("A es la esfera de mayor peso");
        }
        else if (B > A && B > C){
            System.out.println("B es la esfera de mayor peso");
        }
        else {
            System.out.println("C es la esfera de mayor peso");
        }
    }
}
