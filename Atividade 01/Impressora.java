interface Impressora {
    void imprimir(String texto);
}

class ImpressoraLaser implements Impressora {
    public void imprimir(String texto) {
        System.out.println("Impressão a laser: " + texto);
    }
}

class ImpressoraJatoTinta implements Impressora {
    public void imprimir(String texto) {
        System.out.println("Impressão jato de tinta: " + texto);
    }
}