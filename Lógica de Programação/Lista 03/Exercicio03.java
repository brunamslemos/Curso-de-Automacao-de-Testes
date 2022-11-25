import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        System.out.println("O fatorial deste número é: " + fatorial());
    }

    public static int fatorial (){
    Scanner scan = new Scanner(System.in);
    int num;
    int fat = 1;

        System.out.println("Digite o número que deseja calcular o fatorial: ");
        num = scan.nextInt();

        for(int i = 1;i <= num; i++){
        fat = fat * i;
        }

        scan.close();

        return fat;


    }
}
