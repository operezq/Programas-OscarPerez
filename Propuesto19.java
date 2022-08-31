/*Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el 
perímetro, el valor de la altura y el área del triángulo. */
package poo.propuesto19;
import java.util.Scanner;
public class Propuesto19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado,perimetro,semiperimetro,altura,area;
        System.out.print("Ingrese el valor de un lado: ");
        lado = entrada.nextDouble();
        perimetro = triangulo.equilatero(lado);
        altura = triangulo.alt(perimetro);
        area = triangulo.areaa(lado);
        System.out.println("El perímetro es "+perimetro+"\nLa altura es "+altura+"\nEl área del triángulo es "+area);
    }
}

class triangulo{
    public static double equilatero(double a){
        double perimetro;
        perimetro = a*3;
        return perimetro;
    }
    public static double alt(double a){
        double altura = Math.sqrt(3)*a/2;
        return altura;
    }
    public static double areaa(double a){
        double area = (a*a)/2;
        return area;
    }
}