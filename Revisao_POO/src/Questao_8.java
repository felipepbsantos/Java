import java.util.Scanner;

public class Questao_8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Inteiro positivo, negativo ou neutro?");
        System.out.print("Digite um número -> ");
        x = ler.nextInt();
        if (x == 0){
            System.out.println("O número é neutro");
        } else if (x > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

    }
}
