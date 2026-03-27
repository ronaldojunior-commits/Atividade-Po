public class Veiculo {
    private String marca;

    public Veiculo(String marca){
        this.marca = marca;
    }

    //setters e getters

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void ligar(){
        System.out.println("O veículo " + this.marca + " está ligado.");
    }
}

public class Carro extends Veiculo {

	public Carro(String marca) {
		super(marca);
	}

	@Override
	public void ligar() {
		System.out.println("O carro " + getMarca() + " ligou (override).");
	}

	public void ligar(boolean chavePresencial) {
		if (chavePresencial) {
			System.out.println("O carro " + getMarca() + " ligou com chave presencial.");
		} else {
			System.out.println("Não foi possível ligar o carro " + getMarca() + " sem chave presencial.");
		}
	}
}

public class Moto extends Veiculo {

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void ligar() {
        System.out.println("A moto " + getMarca() + " ligou (override).");
    }

    public void ligar(boolean chavePresencial) {
        if (chavePresencial) {
            System.out.println("A moto " + getMarca() + " ligou com chave presencial.");
        } else {
            System.out.println("Não foi possível ligar a moto " + getMarca() + " sem chave presencial.");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Fiat");
        carro.ligar();
        carro.ligar(true);
        carro.ligar(false);

        Moto moto = new Moto("Yamaha");
        moto.ligar();
        moto.ligar(true);
    }
}
