import java.util.Scanner;

public class Questao_6 {

    public static String classificar_triangulo(float a, float b, float c){
        if (((a == b) && (b != c)) || ((b == c) && (c != a)) || ((c == a) && (a != b))){
            return "Isóceles";
        }
        if ((a == b) && (b == c)){
            return "Equilátero";
        }
        if ((a != b) && (b != c) && (c != a)){
            return "Escaleno";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float a,b,c;
        String resultado;


        System.out.println("Classificando um triangulo a partir das medidas dos lados.");
        System.out.print("Digite um valor para o lado A: ");
        a = ler.nextFloat();
        System.out.print("Digite um valor para o lado B: ");
        b = ler.nextFloat();
        System.out.print("Digite um valor para o lado C: ");
        c = ler.nextFloat();
        System.out.println("O triângulo informado é " + classificar_triangulo(a,b,c));
    }
}
