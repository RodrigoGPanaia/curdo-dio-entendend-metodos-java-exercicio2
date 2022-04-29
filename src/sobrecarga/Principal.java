package sobrecarga;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Exercício quadrilátero");

//        Quadrado

        System.out.println("Área de um Quadrado:");
        double lado;
        System.out.print("Digite o lado do quadrado para calcular sua árear: ");
        lado = scan.nextDouble();

        Quadrilateros.area(lado);
        System.out.println();
        System.out.println("----------------------------------------------------------");

//        Retângulo

        System.out.println("Área de um Retângulo:");
        double lado1, lado2;
        System.out.print("Digite o lado1 do Retângulo para calcular sua árear: ");
        lado1 = scan.nextDouble();
        System.out.print("Digite o lado2 do Retângulo para calcular sua árear: ");
        lado2 = scan.nextDouble();

        Quadrilateros.area(lado1,lado2);
        System.out.println();
        System.out.println("----------------------------------------------------------");

//        Trapézio
        System.out.println("Área de um Trapézio:");
        double ladoMaior, ladoMenor, altura;
        System.out.print("Digite o lado maior do Trapézio para calcular sua árear: ");
        ladoMaior = scan.nextDouble();
        System.out.print("Digite o lado menor do Trapézio para calcular sua árear: ");
        ladoMenor = scan.nextDouble();
        System.out.print("Digite o altura do Trapézio para calcular sua árear: ");
        altura = scan.nextDouble();
        Quadrilateros.area(ladoMaior, ladoMenor, altura);

        System.out.println();
        System.out.println("----------------------------------------------------------");






    }
}
