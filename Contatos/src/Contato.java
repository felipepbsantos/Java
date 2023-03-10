public class Contato {
    // Atributos
    int id;
    String nome;
    String telefone;
    String nascimento;

    // Métodos
    public void apresentar(){
        System.out.println();
        System.out.println("Informacoes do contato");
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Nascimento: " + nascimento);
    }
}
