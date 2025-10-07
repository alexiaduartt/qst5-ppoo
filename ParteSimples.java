public class ParteSimples implements ParteCarro {
    private String nome;
    private double peso;

    public ParteSimples(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public double getPesoTotal() {
        System.out.println("Somando agora o peso de " + nome + ": " + peso);
        return peso;
    }

    public String getNome() {
        return nome;
    }
}