import java.util.Scanner;

public class Questao_5 {

    public static double calculo(double a,double b, double c, double d){
        return (a*b - c*d);
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double a,b,c,d;

        System.out.println("Calcular a seguinte expressão -> A*B-C*D");
        System.out.print("Digite o valor para A: ");
        a = ler.nextDouble();
        System.out.print("Digite o valor para B: ");
        b = ler.nextDouble();
        System.out.print("Digite o valor para C: ");
        c = ler.nextDouble();
        System.out.print("Digite o valor para D: ");
        d = ler.nextDouble();
        System.out.print("O resultado é -> ");
        System.out.printf("%.2f",calculo(a,b,c,d));
    }
}
