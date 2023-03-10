import java.util.Scanner;

public class Agenda {
    //Atributos
    Contato[] lista = new Contato[10];
    int posicao = 0;
    Scanner ler = new Scanner(System.in);

    //Metodos

    public void mostrarlista() {
        System.out.println();
        System.out.println("Contatos:");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println(i + " - " + lista[i].nome);
            } else {
                System.out.println(i + " - Vazio");
            }
        }
        System.out.println();
    }

    public void cadastrar() {
        Contato pessoa;
        pessoa = new Contato();
        System.out.println();
        System.out.println("Cadastrando um contato");
        System.out.print("Digite o ID do contato: ");
        pessoa.id = Integer.parseInt(ler.nextLine());
        System.out.print("Digite o nome do contato: ");
        pessoa.nome = ler.nextLine();
        System.out.print("Digite o telefone do contato: ");
        pessoa.telefone = ler.nextLine();
        System.out.print("Digite a data de nascimento do contato: ");
        pessoa.nascimento = ler.nextLine();
        lista[posicao] = pessoa;
        posicao++;
    }

    public void excluir() {
        int pos;
        System.out.println("Informe a posicao do contato que deseja excluir:");
        pos = Integer.parseInt(ler.nextLine());
        if ((pos < 0) || (pos > lista.length)) {
            System.out.println("Não foi possivel realizar a exclusao pois a posicao indicada nao existe.");
        } else {
            lista[pos] = null;
            System.out.println("Contato excluído com sucesso!");
        }

    }

    public void detalhes() {
        int pos;
        System.out.println("Informe a posicao do contato que deseja ver os detalhes:");
        pos = Integer.parseInt(ler.nextLine());
        if ((pos < 0) || (pos > lista.length) || (lista[pos] == null)) {
            System.out.println("Nao foi possivel mostrar os detalhes pois a posicao indicada nao existe.");
        } else {
            lista[pos].apresentar();
        }

    }

    public void alterar(){
        int pos;
        System.out.println("Informe a posicao do contato que deseja alterar:");
        pos = Integer.parseInt(ler.nextLine());
        if ((pos < 0) || (pos > lista.length) || (lista[pos] == null)) {
            System.out.println("Nao foi possivel mostrar os detalhes pois o contato indicado nao existe.");
        } else {
            lista[pos].apresentar();

        }
    }
}



