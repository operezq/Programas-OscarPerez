/*Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los 
siguientes datos: 
• Número de inscripción 
• Nombres 
• Patrimonio. 
• Estrato social. 
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio 
es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3% 
sobre el patrimonio. Hacer un algoritmo que muestre: 
• Número de inscripción. 
• Nombres. 
• Pago de matrícula. */
package poo.resueltoej10;
import java.util.Scanner;
public class ResueltoEj10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        estudiante miestudiante = new estudiante();
        System.out.print("Número de inscripción del estudiante: ");
        miestudiante.numero = entrada.nextInt(); 
        System.out.print("Nombre del estudiante: ");
        miestudiante.nombre = entrada.next();
        System.out.print("Patrimonio del estudiante: ");
        miestudiante.patrimonio = entrada.nextInt();
        System.out.print("Estrato del estudiante: ");
        miestudiante.estrato = entrada.nextInt();
        if (miestudiante.patrimonio>2000000 && miestudiante.estrato>3){
            miestudiante.matricula = 50000+miestudiante.patrimonio*0.03;
        }
        else {
            miestudiante.matricula = 50000;
        }
        miestudiante.datos();
    }
}

class estudiante {
    int numero,patrimonio,estrato;
    double matricula;
    String nombre;
    public void datos(){
        System.out.print("\nNúmero de inscripción: "+numero);
        System.out.print("\nNombre del estudiante: "+nombre);
        System.out.print("\nValor de la matrícula: "+matricula);
    }
}

