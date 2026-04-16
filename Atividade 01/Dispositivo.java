interface Dispositivo {
    void ligar();
    void desligar();
}

class Televisao implements Dispositivo {
    public void ligar() {
        System.out.println("TV ligada");
    }

    public void desligar() {
        System.out.println("TV desligada");
    }
}

class Computador implements Dispositivo {
    public void ligar() {
        System.out.println("Computador iniciando");
    }

    public void desligar() {
        System.out.println("Computador desligando");
    }
}