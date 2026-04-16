interface Forma {
    double calcularArea();
}

class Quadrado implements Forma {
    double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}

class Circulo implements Forma {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}