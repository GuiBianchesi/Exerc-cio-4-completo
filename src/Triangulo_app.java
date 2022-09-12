import java.util.Scanner;

public class Triangulo_app {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        Triangulo triangulo1 = new Triangulo();
        System.out.println("Entre com a base: ");
        triangulo1.base = leia.nextFloat();
        System.out.println("Entre com a altura: ");
        triangulo1.altura = leia.nextFloat();
        
        System.out.println(triangulo1.imprimeDados());
        System.out.println("Área do triângulo: ");
        triangulo1.calculaArea();

        Triangulo triangulo2 = new Triangulo();
        System.out.println("Entre com a base: ");
        triangulo2.base = leia.nextFloat();
        System.out.println("Entre com a altura: ");
        triangulo2.altura = leia.nextFloat();

        System.out.println(triangulo2.imprimeDados());
        System.out.println("Área do triângulo: ");
        triangulo2.calculaArea();

        leia.close();
    }
}