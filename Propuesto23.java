/*Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado, 
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación*/
package poo.propuesto23;
import java.util.Scanner;
public class Propuesto23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,c;
        System.out.print("Ingrese A: ");
        a = entrada.nextInt();
        System.out.print("Ingrese B: ");
        b = entrada.nextInt();
        System.out.print("Ingrese C: ");
        c = entrada.nextInt();
        double ecuacion1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        double ecuacion2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        System.out.println("Las soluciones de la ecuación son "+ecuacion1+" y "+ecuacion2);
    }
}
