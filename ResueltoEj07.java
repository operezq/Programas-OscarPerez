/*Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo 
si A es mayor, menor o igual a B. */
package poo.resueltoej7;
import java.util.Scanner;
public class ResueltoEj7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b;
        System.out.print("Ingrese un número: ");
        a = entrada.nextInt();
        System.out.print("Ingrese otro número: ");
        b = entrada.nextInt();
        if (a>b){
            System.out.println("\n"+a+" es mayor que "+b);
        }
        else if (b>a){
            System.out.println("\n"+b+" es mayor que "+a);
        }
        else{
            System.out.println("\nLos números son iguales");
        }
    }
}
