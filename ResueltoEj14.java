/*Una empresa con tres departamentos tiene establecido un plan de incentivos para sus 
vendedores. Al final del período, a cada departamento se le pide el importe global de las 
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al 
salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las 
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos: 
• Ventas del departamento 1 
• Ventas del departamento 2 
• Ventas del departamento 3 
• Salario de los vendedores de cada departamento 
Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento 
al finalizar el período. */
package poo.resueltoej14;
import java.util.Scanner;
public class ResueltoEj14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dep1,dep2,dep3;
        float salario1,salario2,salario3;
        System.out.print("Ingrese las ventas del departamento 1: ");
        dep1 = entrada.nextInt();
        System.out.print("Ingrese las ventas del departamento 2: ");
        dep2 = entrada.nextInt();
        System.out.print("Ingrese las ventas del departamento 3: ");
        dep3 = entrada.nextInt();
        System.out.print("\nIngrese el salario de los vendedores del departamento 1: ");
        salario1 = entrada.nextInt();
        System.out.print("Ingrese el salario de los vendedores del departamento 2: ");
        salario2 = entrada.nextInt();
        System.out.print("Ingrese el salario de los vendedores del departamento 3: ");
        salario3 = entrada.nextInt();
        int total = dep1 + dep2 + dep3;

        if((float) dep1/total>0.33){
            salario1 += salario1*0.2;
        }
        if ((float) dep2/total>0.33){
            salario2 += salario2*0.2;
        }
        if ((float) dep3/total>0.33){
            salario3 += salario3*0.2;
        }
        System.out.println("\nLos vendedores del departamento 1 recibirán "+salario1
                +"\nLos vendedores del departamento 2 recibirán "+salario2
        +"\nLos vendedores del departamento 3 recibirán "+salario3);
    }
}
