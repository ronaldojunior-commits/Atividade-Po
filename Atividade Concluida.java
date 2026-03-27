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
