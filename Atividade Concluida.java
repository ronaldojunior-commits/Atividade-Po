public class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("Animal faz um som.");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}

public class Cachorro extends Animal{
    String raca;

    public Cachorro(String nome, String raca){
    super(nome);
    this.raca = raca;
    }
    
    public void emitirSom(int vezes){
        for(int i = 0; i < vezes; i++){
            System.out.println("O cachorro late: Au Au!");
        }
    }
}

public class Gato extends Animal{
    String cor;

    public Gato(String nome, String cor){
        super(nome);
        this.cor = cor;
    }
    
    public void emitirSom(){
        System.out.println("O gato mia: Miau!");
    }
}

public class Main {
    public static void main(String[] args){
        Cachorro c1 = new Cachorro("Max", "Pastor Alemão");

        Gato g1 = new Gato("Cleitinho", "Branco");

        c1.emitirSom(3);
        
        g1.emitirSom();
    }
}
