import java.util.ArrayList;
import java.util.List;

public class ParteComposta implements ParteCarro {
    private String nome;
    private List<ParteCarro> partes = new ArrayList<>();

    public ParteComposta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ParteCarro parte) {
        partes.add(parte);
    }

    @Override
    public double getPesoTotal() {
        double total = 0;
        for (ParteCarro parte : partes) {
            total += parte.getPesoTotal();
            System.out.println("Total parcial de " + nome + ": " + total);
        }
        return total;
    }

    public String getNome() {
        return nome;
    }
}