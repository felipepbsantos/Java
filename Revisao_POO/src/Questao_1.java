import java.util.Scanner;

public class Questao_1 {

    private static double pol_to_mm(double valor){
        return (valor * 25.4);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor;
        System.out.println("Digite a quantidade de chuva em polegadas e receba a equivalente em milímetros:");
        valor = pol_to_mm(ler.nextDouble());
        System.out.println("A quantidade de chuva equivalente em milimetros e: " + valor);
    }


}
