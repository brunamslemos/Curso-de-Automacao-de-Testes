import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, forneça o tempo gasto na viagem (em horas): ");
        double tempoGasto = scan.nextDouble();

        System.out.println("Por favor, forneça agora a velocidade média durante a viagem (em Km/h): ");
        double velocidadeMedia = scan.nextDouble();

        double quilômetros = tempoGasto * velocidadeMedia;

        double litrosNecessarios = quilômetros / 12;

        System.out.printf("Gastos %.3f litros", litrosNecessarios);
    }
}
