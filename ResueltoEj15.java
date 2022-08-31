/*Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una 
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor 
o menor peso. */
package poo.resuelto15;
import java.util.Scanner;
public class Resuelto15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A,B,C,D;
        System.out.print("Ingrese el peso de la esfera A: ");
        A = entrada.nextInt();
        System.out.print("Ingrese el peso de la esfera B: ");
        B = entrada.nextInt();
        System.out.print("Ingrese el peso de la esfera C: ");
        C = entrada.nextInt();
        System.out.print("Ingrese el peso de la esfera D: ");
        D = entrada.nextInt();
        if (A == B && A != D){
            if(A<D){
                System.out.println("La esfera diferente es la D y es de mayor peso");
            }
            else {
                System.out.println("La esfera diferente es la D y es de menor peso");
            }
        }
        else if (A == B && A != C){
            if(A<C){
                System.out.println("La esfera diferente es la C y es de mayor peso");
            }
            else {
                System.out.println("La esfera diferente es la C y es de menor peso");
            }
        }
        else if (A == C && A != B){
            if(A<B){
                System.out.println("La esfera diferente es la B y es de mayor peso");
            }
            else {
                System.out.println("La esfera diferente es la A y es de menor peso");
            }
        }
        else {
            if(B<A){
                System.out.println("La esfera diferente es la A y es de mayor peso");
            }
            else {
                System.out.println("La esfera diferente es la A y es de menor peso");
            }
        }
    }
}

