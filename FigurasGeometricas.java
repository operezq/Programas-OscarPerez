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
        // Creación de objetos
        circulo figura1 = new circulo(2);
        rectangulo figura2 = new rectangulo(1,2);
        cuadrado figura3 = new cuadrado(3);
        triangulo figura4 = new triangulo(3,5);
        // Círculo
        System.out.println("\n\tCírculo:");
        System.out.println("\nEl área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        //Rectángulo
        System.out.println("\n\tRectángulo:");
        System.out.println("\nEl área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        //Cuadrado
        System.out.println("\n\tCuadrado:");
        System.out.println("\nEl área del cuadrado es = "+ figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        //Triángulo
        System.out.println("\n\tTriángulo:");
        System.out.println("\nEl área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}

class circulo{
       int radio;
        circulo(int radio){
        this.radio = radio;
    }
         double calcularArea(){
            return Math.PI*Math.pow(radio,2);
    }
        double calcularPerimetro(){
            return 2*Math.PI*radio;
        }
}
class rectangulo{
    int base,altura;
    rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
        public double calcularArea(){
            return base*altura;
        }
        public double calcularPerimetro(){
            return base*2+altura*2;
        }
}
class cuadrado{
    int lado;
    cuadrado(int lado){
        this.lado = lado;
    }
        public double calcularArea(){
            return Math.pow(lado,2);
        }
        public double calcularPerimetro(){
            return lado*4;
        }
}
class triangulo{
    int base,altura;
    triangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }
        public double calcularHipotenusa() {
            return Math.pow(base*base + altura*altura, 0.5);
                }
        public double calcularArea(){
            return base*altura/2;
        }
        public double calcularPerimetro(){
            return base+altura+calcularHipotenusa();
        }
        void determinarTipoTriangulo() {
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
