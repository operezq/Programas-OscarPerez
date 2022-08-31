/*Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el 
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor 
de $450.000, de lo contrario escriba sólo el nombre. */

package poo.propuesto22;
import java.util.Scanner;
public class Propuesto22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int salario,horas;
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.next();
        System.out.print("Ingrese el salario básico por hora del empleado: ");
        salario = entrada.nextInt();
        System.out.print("Ingrese las horas trabajadas en el mes por el empleado: ");
        horas = entrada.nextInt();
        int total = salario*horas;
        if(total>450000){
            System.out.println("\n"+nombre+"\n"+total);
        }
        else{
            System.out.println("\n"+nombre);
        }
    }
}
