import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Agenda meus_contatos = new Agenda();
        boolean menuloop = true;
        int opcao;

        while (menuloop){

            meus_contatos.mostrarlista();

            System.out.println("1 - Incluir");
            System.out.println("2 - Consultar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.println("Selecione uma funcao:");
            opcao = Integer.parseInt(ler.nextLine());

            if (opcao == 1){
                meus_contatos.cadastrar();
            } else if (opcao == 2) {
                meus_contatos.detalhes();
            } else if (opcao == 3) {
                meus_contatos.alterar();
            } else if (opcao == 4) {
                meus_contatos.excluir();
            } else if (opcao == 5) {
                menuloop = false;
            } else{
                System.out.println();
                System.out.println("Opcao invalida!");
                System.out.println();
            }
        }













    }

}
