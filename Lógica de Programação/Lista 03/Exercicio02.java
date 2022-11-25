import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite a conversão que deseja (1 - Celsius para Kelvin ou 2 - Kelvin para Celsius): ");
        int op = scan.nextInt();

        System.out.println("Digite a temperatura atual: ");
        double temperaturaAtual = scan.nextDouble();


        switch(op){
            case 1:
                System.out.println(celsiusKelvin(temperaturaAtual) + " graus Celsius");
                break;

            case 2:
                System.out.println(kelvinCelsius(temperaturaAtual) + " Kelvin");
                break;

            default:
                System.out.println("Erro");
                break;

        }
        scan.close();
    }

    public static double celsiusKelvin(double a){

        return a + 273.15;
    }

    public static double kelvinCelsius(double a){

        return a - 273.15;
    }
}
