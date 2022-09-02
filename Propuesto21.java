/* Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro, 
semiperímetro y el área del triángulo. */

package poo.propuesto21;
import java.util.Scanner;
public class Propuesto21 {
    public static void main(String[] args) {
        double base,lado1,lado2,perimetro,semiperimetro,area;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de la base del triángulo: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese el valor de un lado del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Ingrese el valor del lado restante del triángulo: ");
        lado2 = entrada.nextDouble();
        perimetro = triangulo.perimetro(base,lado1,lado2);
        semiperimetro = triangulo.semiperimetro(base,lado1,lado2);
        area = triangulo.area(base,lado1,lado2);
        System.out.println("\nPerímetro: "+perimetro+"\nSemiperímetro: "+semiperimetro+"\nÁrea: "+area);
        System.out.println("\nIMPORTANTE: En caso de obtener en el área un valor como cero o NaN, significa que ingresaste valores no aceptables, repítelo.");
    }
}

class triangulo {
    public static double perimetro(double a,double b,double c){
        double d = a+b+c;
        return d;
    }
    public static double semiperimetro(double a,double b,double c){
        double d = (a+b+c)/2;
        return d; 
    }
    public static double area(double a,double b,double c){
        double d,area,semip = (a+b+c)/2;
            if (a!=b && a!=c && b!=c){
                area = Math.sqrt(semip*(semip-a)*(semip-b)*(semip-c)); //Área del triángulo escaleno
            }
            else if (a == b && a == c && b == c){
                area = Math.sqrt(3)*a/2; //Area del triángulo equilátero
            }
            else {
                d = Math.sqrt(Math.pow(b,2)-(Math.pow(a,2)/4)); // Altura del triángulo Isósceles
                area = d*a/2;
            }
            return area;
    }
}
