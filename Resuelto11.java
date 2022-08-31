/*Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de 
ellos. */

package poo.resuelto11;
import java.util.Scanner;
public class Resuelto11 {

    public static void main(String[] args) {
        int a,b,c;
        String mayor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese tres números: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        mayor = valormayor.mayor(a,b,c);
        System.out.println(mayor);
    }
}

class valormayor{
    public static String mayor(int a,int b,int c){
        if (a>b && a>c){
            return (a+" es el número mayor");
        }
        else if (b>a && b>c){
            return (b+" es el número mayor");
        }
        else {
            return (c+" es el número mayor");
        }
    }
}