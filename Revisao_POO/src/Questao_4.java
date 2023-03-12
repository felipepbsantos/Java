import java.util.Scanner;

public class Questao_4 {
    public static double calc_media(float a, double peso_a,float b,double peso_b, float c, double peso_c){
        return ((a*peso_a+b*peso_b+c*peso_c)/(peso_a+peso_b+peso_c));
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float a, b, c;
        double media;
        System.out.println("Calcular a calcular a media do aluno atraves das notas A, B e C.");
        System.out.print("Digite a nota A: ");
        a = ler.nextFloat();
        System.out.print("Digite a nota B: ");
        b = ler.nextFloat();
        System.out.print("Digite a nota C: ");
        c = ler.nextFloat();
        media = calc_media(a,2,b,3,c,5);
        System.out.print("A media para as notas informadas é ");
        System.out.printf("%.2f",media);
}
}
