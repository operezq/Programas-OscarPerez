/*Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la 
compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita 
es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es 
amarilla un 25%, si es azul un 50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un 
cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores 
mencionados.*/

package poo.resueltoej13;
import java.util.Scanner;
public class ResueltoEj13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int compra;
        double total = 0;
        String color;
        System.out.print("Valor de la compra: ");
        compra = entrada.nextInt();
        System.out.println("Ingrese alguno de estos colores: Blanco, verde,amarillo,azul,rojo.");
        System.out.print("Color de la bolita: ");
        color = entrada.next().toLowerCase();
        
        if ("blanco".equals(color)){
            total = compra;
        }
        else if ("verde".equals(color)) {
            total = compra-compra*0.1;
        }
        else if ("amarillo".equals(color)){
            total = compra-compra*0.25;
        }
        
        else if ("azul".equals(color)){
            total = compra-compra*0.5;
        }
        
        else if ("rojo".equals(color)){
            total = 0;
        }
        
        System.out.println("El cliente sacó la bolita de color "+color+", por tanto el total de su compra es de "+total);
    }
}
