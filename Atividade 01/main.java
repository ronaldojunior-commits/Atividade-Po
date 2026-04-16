public class main{
    public static void main(String[] args){

        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Pix();
        p1.pagar(100);
        p2.pagar(50);


        Veiculo v1 = new Carro();
        Veiculo v2 = new Moto();
        v1.ligar();
        v2.desligar();


        Bonus b1 = new Gerente();
        Bonus b2 = new Vendedor();
        System.out.println(b1.calcularBonus(2000));
        System.out.println(b2.calcularBonus(2000));

        Forma f1 = new Quadrado(4);
        Forma f2 = new Circulo(3);
        System.out.println(f1.calcularArea());
        System.out.println(f2.calcularArea());

         // Ex5
        Notificacao n = new Email();
        n.enviarMensagem("Olá!");

        // Ex6
        Dispositivo d = new Televisao();
        d.ligar();

        // Ex7
        Entrega e = new Correios();
        System.out.println(e.calcularFrete(5));

        // Ex8
        Autenticacao a = new Administrador();
        System.out.println(a.login("admin", "admin123"));

        // Ex9
        Impressora i = new ImpressoraLaser();
        i.imprimir("Documento");

        // Ex10
        Arquivo arq = new ArquivoTexto();
        arq.abrir();
    }
}