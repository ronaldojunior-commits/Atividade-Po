public class ContaBancaria{
    private String numeroConta;
    private String titular;
    private double saldo;

//construtor padrão.
public ContaBancaria(){

}

//construtor para iniciar a conta.
public ContaBancaria(String numeroConta, String titular, double saldo){
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar (double valor){
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + "Realizado com Sucesso!");
        }else{
            System.out.println("Valor de Depósito Inválido!");
            return;
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            System.out.println("Saque de R$ " + valor + "Realizado com Sucesso!");
        }else {
            System.out.println("Saque Inválido! Valor Negativo ou Saldo Insuficiente!");

            int c100, c50, c20, c10, c5, c2, c1;
            int r100, r50, r20, r10, r5, r2;

            c100 = (int)valor / 100;
            r100 = (int)valor % 100;

            c50 = (int) r100 / 50;
            r50 = (int) r100 % 50;
            
            c20 = (int) r50 / 20;
            r20 = (int) r50 % 20;

            c10 = (int) r20 / 10;
            r10 = (int) r20 % 10;

            c5 = (int) r10 / 5;
            r5 = (int) r10 % 5;

            c2 = (int) r5 / 2;
            r2 = (int) r5 % 2;

            c1 = (int) r2 / 1;

            System.out.println("Saque feito com Sucesso!!");
            System.out.println("Cédulas de 100");
            System.out.println("Cédulas de 50");
            System.out.println("Cédulas de 20");
            System.out.println("Cédulas de 10");
            System.out.println("Cédulas de 5");
            System.out.println("Cédulas de 2");
            System.out.println("Cédulas de 1");
        }
    }
}
