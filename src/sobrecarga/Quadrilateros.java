package sobrecarga;

public class Quadrilateros {

    public static void area(double lado){

        System.out.println("Área do Quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do Retângulo: " + lado1 * lado2);
    }

    public static void area(double ladoMaior, double ladoMenor, double altura){

        System.out.println("Área do Trapézio: " + ((ladoMaior + ladoMenor) * altura) / 2);
    }

}
