import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.println("Digite o número de horas trabalhadas por mês");
        float numeroHoras = scan.nextFloat();

        System.out.println("Qual o valor da hora?");
        float valorHora = scan.nextFloat();

        float resultado = funcionario(numeroHoras, valorHora);

        System.out.printf("O salário anual de " + nome + " é %.2f", resultado);

        scan.close();
    }


    public static float funcionario(float numeroHoras, float valorHora){

        float calculoHoras = numeroHoras * valorHora;

        float salarioAnual = calculoHoras * 13;

        return salarioAnual;
    }

}
