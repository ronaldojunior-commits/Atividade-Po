interface Pagamento {
    void pagar(double valor);
}

class CartaoCredito implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento no cartão de crédito: R$ " + valor);
    }
}

class Pix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento via Pix: R$ " + valor);
    }
}