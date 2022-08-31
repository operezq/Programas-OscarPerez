/*Se tiene la siguiente información de un empleado: 
 · código del empleado, 
 · nombres, 
 · número de horas trabajadas al mes, 
 · valor hora trabajada, 
 · porcentaje de retención en la fuente. 
 Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto. */

package poo.propuestos;
import java.util.Scanner;
public class Propuestos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float retefuente,salarioNeto;
        int codigo,horas,valorhora,salarioBruto;
        String nombre;
        System.out.print("Ingrese el código del empleado: ");
        codigo  = entrada.nextInt();
        System.out.print("Ingrese el nombre del empleado con código "+codigo+": ");
        nombre = entrada.next();
        System.out.print("Horas trabajadas en el mes del empleado "+nombre+": ");
        horas = entrada.nextInt();
        System.out.print("Cada hora trabajada equivale a: ");
        valorhora = entrada.nextInt();
        System.out.print("Porcentaje de retención de la fuente: ");
        retefuente = entrada.nextFloat()/100;
        salarioBruto = horas*valorhora;
        salarioNeto = salarioBruto-(salarioBruto*retefuente);
        System.out.println("\n"+codigo+" "+nombre+" ");
    }
}