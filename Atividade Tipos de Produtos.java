public class Produto {
    protected String nome;
    protected double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para exibir informações
    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

public class Eletronico extends Produto {
    private int garantia; // em meses

    // Construtor
    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    // Sobrescrita do método
    @Override
    public void mostrarProduto() {
        System.out.println("===== PRODUTO ELETRÔNICO =====");
        super.mostrarProduto();
        System.out.println("Garantia: " + garantia + " meses");
        System.out.println("==============================\n");
    }
}

public class Alimento extends Produto {
    private String dataValidade;

    // Construtor
    public Alimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    // Sobrescrita do método
    @Override
    public void mostrarProduto() {
        System.out.println("========= ALIMENTO =========");
        super.mostrarProduto();
        System.out.println("Validade: " + dataValidade);
        System.out.println("===========================\n");
    }
}

public class Main {
    public static void main(String[] args) {

        // Criando objetos
        Eletronico eletronico = new Eletronico("Notebook", 3500.00, 12);
        Alimento alimento = new Alimento("Arroz", 25.90, "10/12/2026");

        // Exibindo informações
        eletronico.mostrarProduto();
        alimento.mostrarProduto();
    }
}
