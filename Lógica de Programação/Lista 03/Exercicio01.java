import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int op = scan.nextInt();

        System.out.println("Digite o primeiro valor: ");
        double num1 = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite o segundo valor: ");
        double num2 = scan.nextInt();

        if(op == 4 && num2 == 0){
            System.out.println("Não é possível divisão por zero");
            return;
        }

        switch (op){
            case 1:
                System.out.println("Soma: " + soma(num1, num2));
                break;
            case 2:
                System.out.println("Subtração: " + subtracao(num1, num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + multiplicacao(num1, num2));
                break;
            case 4:
                System.out.println("Divisão: " + divisao(num1, num2));
                break;
            default:
                System.out.println("Erro");
                break;
        }

        scan.close();
    }

    public static double soma(double a, double b){

        return a + b;
    }

    public static double subtracao(double a, double b){

        return a - b;
    }

    public static double multiplicacao(double a, double b) {

        return a * b;
    }

    public static double divisao(double a, double b) {

        return a / b;
    }
}
