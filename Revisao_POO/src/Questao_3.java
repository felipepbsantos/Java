import java.util.Scanner;

public class Questao_3 {

    public static double calc_media(float a, double peso_a,float b,double peso_b){
        return ((a*peso_a+b*peso_b)/(peso_a+peso_b));
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float a, b;
        double media;
        System.out.println("Calcular a calcular a media do aluno atraves das notas A e B.");
        System.out.print("Digite a nota A: ");
        a = ler.nextFloat();
        System.out.print("Digite a nota B: ");
        b = ler.nextFloat();
        media = calc_media(a,3.5,b,7.5);
        System.out.print("A media para as notas informadas é ");
        System.out.printf("%.2f",media);
    }
}
