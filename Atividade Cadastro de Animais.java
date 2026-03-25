public class Animal {
    protected String nome;
    protected double peso;

    // Construtor
    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // Método para exibir informações
    public void mostrarAnimal() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
    }
}

public class Cachorro extends Animal {
    private String raca;

    // Construtor
    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    // Sobrescrita do método
    @Override
    public void mostrarAnimal() {
        System.out.println("===== DADOS DO CACHORRO =====");
        super.mostrarAnimal();
        System.out.println("Raça: " + raca);
        System.out.println("=============================\n");
    }
}

public class Gato extends Animal {
    private String cor;

    // Construtor
    public Gato(String nome, double peso, String cor) {
        super(nome, peso);
        this.cor = cor;
    }

    // Sobrescrita do método
    @Override
    public void mostrarAnimal() {
        System.out.println("======= DADOS DO GATO =======");
        super.mostrarAnimal();
        System.out.println("Cor: " + cor);
        System.out.println("============================\n");
    }
}

public class Main {
    public static void main(String[] args) {

        // Criando objetos
        Cachorro cachorro = new Cachorro("Rex", 20.5, "Labrador");
        Gato gato = new Gato("Mimi", 4.2, "Branco");

        // Exibindo informações
        cachorro.mostrarAnimal();
        gato.mostrarAnimal();
    }
}
