public class Veiculo {
    protected String marca;
    protected int ano;

    // Construtor
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

public class Carro extends Veiculo {
    private int portas;

    // Construtor
    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    // Sobrescrita do método
    @Override
    public void exibirInformacoes() {
        System.out.println("===== DADOS DO CARRO =====");
        super.exibirInformacoes();
        System.out.println("Portas: " + portas);
        System.out.println("==========================\n");
    }
}

public class Moto extends Veiculo {
    private int cilindradas;

    // Construtor
    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    // Sobrescrita do método
    @Override
    public void exibirInformacoes() {
        System.out.println("===== DADOS DA MOTO =====");
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas + "cc");
        System.out.println("=========================\n");
    }
}

public class Main {
    public static void main(String[] args) {

        // Criando objetos
        Carro carro = new Carro("Toyota", 2022, 4);
        Moto moto = new Moto("Honda", 2021, 160);

        // Exibindo informações
        carro.exibirInformacoes();
        moto.exibirInformacoes();
    }
}
