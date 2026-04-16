interface Veiculo {
    void ligar();
    void desligar();
}

class Carro implements Veiculo {
    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void desligar() {
        System.out.println("Carro desligado");
    }
}

class Moto implements Veiculo {
    public void ligar() {
        System.out.println("Moto ligada");
    }

    public void desligar() {
        System.out.println("Moto desligada");
    }
}