import java.util.Date;

public class Quartos {
    private String tipo;
    private String cliente;
    private Date entrada;
    private Date saida;

    private double valor(String tipo){
        switch (tipo){
            case "A":
                return 150.00;
            case "B":
                return 100.00;
            case "C":
                return 75.00;
            case "D":
                return 50.00;
        }
        return 0;
    }

    public void criar_quarto(String tipo, String cliente, Date entrada, Date saida) {
        this.tipo = tipo;
        this.cliente = null;
        this.entrada = null;
        this.saida = null;
    }
}
