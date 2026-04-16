interface Entrega {
    double calcularFrete(double peso);
}

class Correios implements Entrega {
    public double calcularFrete(double peso) {
        return peso * 10;
    }
}

class Transportadora implements Entrega {
    public double calcularFrete(double peso) {
        return peso * 8;
    }
}