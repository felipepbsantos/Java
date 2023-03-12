import java.util.Scanner;

public class Questao_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float A, B;
        double Hip;
        System.out.println("Calcular a hipotenusa de um triangulo retangulo atraves do cateto A e B.");
        System.out.print("Digite o cateto A: ");
        A = ler.nextFloat();
        System.out.print("Digite o cateto B: ");
        B = ler.nextFloat();
        Hip = Math.pow((Math.pow(A,2)+Math.pow(B,2)),(0.5));
        System.out.println("A hitenusa para os catetos informados é " + Hip);
    }
}
