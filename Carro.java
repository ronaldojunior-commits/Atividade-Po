public class Carro {
    String marca;
    private int velocidade_atual;
    int velocidade_maxima;

    public Carro() {
        this.velocidade_atual = 0;
    }

    public Carro(String marca, int velocidade_atual, int velocidade_maxima) {
        this.marca = marca;
        this.velocidade_atual = velocidade_atual;
        this.velocidade_maxima = velocidade_maxima;
    }

    public void acelerar(int valor) {
        if ((this.velocidade_atual + valor) > velocidade_maxima) {
            System.out.println("Velocidade Inválida!");
        }
        this.velocidade_atual = this.velocidade_atual + valor;
        System.out.println(this.velocidade_atual);
    }

    public void freiar(int valor) {
        if (valor > this.velocidade_atual) {
            System.out.println("Velocidade Inválida!");
        } else {
            this.velocidade_atual = this.velocidade_atual - valor;
            System.out.println(this.velocidade_atual);
        }
    }

    public int getVelocidade_atual() {
        return velocidade_atual;
    }

    public int getVelocidade_maxima(){
    return velocidade_maxima;
    }
}
