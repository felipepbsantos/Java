import java.util.Scanner;

public class Questao_9 {

    public static double media(float a, double peso_a,float b,double peso_b, float c, double peso_c){
        return ((a*peso_a+b*peso_b+c*peso_c)/(peso_a+peso_b+peso_c));
    }

    public static void main(String[] args) {
        float a,b,c;
        double resultado_media = 0;
        int escolha = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual método você quer utilizar para calcular a média?");
        System.out.println("1 - Aritmética");
        System.out.println("2 - Ponderada (3,3,4)");
        System.out.print("Escolha o número da opção -> ");
        escolha = ler.nextInt();
        System.out.println();

        System.out.print("Digite o valor da nota A: ");
        a = ler.nextFloat();
        System.out.print("Digite o valor da nota B: ");
        b = ler.nextFloat();
        System.out.print("Digite o valor da nota C: ");
        c = ler.nextFloat();

        if (escolha == 1){
            resultado_media = media(a,1,b,1,c,1);
        } else if (escolha == 2) {
            resultado_media = media(a,3,b,3,c,4);
        }
        System.out.print("A média resultante é ");
        System.out.printf("%.2f", resultado_media);
    }
}
