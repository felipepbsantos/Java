import java.util.Scanner;

public class Questao_7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int x;
        System.out.println("Par ou Ímpar?");
        System.out.print("Digite um número inteiro -> ");
        x = ler.nextInt();
        if ((x % 2)==0){
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }

    }


}
