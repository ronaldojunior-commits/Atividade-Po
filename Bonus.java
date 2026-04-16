interface Bonus {
    double calcularBonus(double salario);
}

class Gerente implements Bonus {
    public double calcularBonus(double salario) {
        return salario * 0.20;
    }
}

class Vendedor implements Bonus {
    public double calcularBonus(double salario) {
        return salario * 0.10;
    }
}