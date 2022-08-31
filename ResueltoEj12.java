/*Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas 
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden 
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando 
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo 
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes 
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora 
normal de trabajo.*/

package poo.resueltoej12;
import java.util.Scanner;
public class ResueltoEj12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int horas,valorhora,salario;
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.next();
        System.out.print("Horas trabajadas: ");
        horas = entrada.nextInt();
        System.out.print("Valor por hora de trabajo: ");
        valorhora = entrada.nextInt();
        
        if (horas>40){
            if (horas-40<=8){
                salario = valorhora*40+(horas-40)*valorhora*2;
            }
            else{
                salario = valorhora*40+8*valorhora+(horas-48)*3;
            }
        
        }
        else{
            salario = horas*valorhora;
        }
        System.out.println("\nSalario total del trabajador: "+salario);
    }
}
