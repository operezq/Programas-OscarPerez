/*Se requiere un programa que modele varias figuras geométricas: el círculo, 
el rectángulo, el cuadrado y el triángulo rectángulo.
u El círculo tiene como atributo su radio en centímetros.
u El rectángulo, su base y altura en centímetros.
u El cuadrado, la longitud de sus lados en centímetros.
u El triángulo, su base y altura en centímetros.

Se requieren métodos para determinar el área y el perímetro de cada 
figura geométrica. Además, para el triángulo rectángulo se requiere:
u Un método que calcule la hipotenusa del rectángulo.
u Un método para determinar qué tipo de triángulo es:
Equilátero: todos sus lados son iguales.
Isósceles: tiene dos lados iguales.
Escaleno: todos sus lados son diferentes.*/

package poo.figurasgeometricas;
import java.util.Scanner;
public class FigurasGeometricas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¡¡¡MODELAMIENTO DE FIGURAS GEOMÉTRICAS!!!");
        System.out.print("\tCírculo:");
        circulo figuracirculo = new circulo();
    }
}

class circulo{
    int radio;
        public static double calcularArea(int radio){
            return Math.PI*Math.pow(radio,2);
    }
        public static double calcularPerimetro(int radio){
            return 2*Math.PI*radio;
        }
}
class rectangulo{
    int base,altura;
        public static double calcularArea(int base,int altura){
            return base*altura;
        }
        public static double calcularPerimetro(int base,int altura){
            return base*2+altura*2;
        }
}
class cuadrado{
    int lado;
        public static double calcularArea(int lado){
            return Math.pow(lado,2);
        }
        public static double calcularPerimetro(int lado){
            return lado*4;
        }
}
class triangulo{
    int base,altura;
        public double calcularHipotenusa() {
            return Math.pow(base*base + altura*altura, 0.5);
                }
        public static double calcularArea(int base,int altura){
            return base*altura/2;
        }
        public double calcularPerimetro(int base,int altura){
            return base+altura+calcularHipotenusa();
        }
        void determinarTipoTriángulo() {
            if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero"); /* Todos sus 
            lados son iguales */
            else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triángulo escaleno"); /* Todos sus 
            lados son diferentes */
            else 
            System.out.println("Es un triángulo isósceles"); /* De otra 
            manera, es isósceles */
    }
}