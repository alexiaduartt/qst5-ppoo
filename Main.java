public class Main {
    public static void main(String[] args) {
        // ----- CARROCERIA -----
        ParteComposta carroceria = new ParteComposta("Carroceria");
        carroceria.adicionar(new ParteSimples("Capô", 12));
        carroceria.adicionar(new ParteSimples("Porta", 15));
        carroceria.adicionar(new ParteSimples("Painel", 8));
        carroceria.adicionar(new ParteSimples("Para-lama", 10));
        carroceria.adicionar(new ParteSimples("Porta-malas", 18));

        // ----- TREM DE FORÇA -----
        ParteComposta tremDeForca = new ParteComposta("Trem de Força");
        tremDeForca.adicionar(new ParteSimples("Motor", 150));
        tremDeForca.adicionar(new ParteSimples("Transmissão", 60));
        tremDeForca.adicionar(new ParteSimples("Diferencial", 40));
        tremDeForca.adicionar(new ParteSimples("Rodas", 80));

        // ----- CHASSI -----
        ParteComposta chassi = new ParteComposta("Chassi");
        chassi.adicionar(tremDeForca);
        chassi.adicionar(new ParteSimples("Suspensão", 50));

        // ----- CARRO COMPLETO -----
        ParteComposta carro = new ParteComposta("Carro");
        carro.adicionar(carroceria);
        carro.adicionar(chassi);

        // ----- CÁLCULO -----
        double pesoTotal = carro.getPesoTotal();
        System.out.println("\nPeso total do carro: " + pesoTotal + " kg");
    }
}