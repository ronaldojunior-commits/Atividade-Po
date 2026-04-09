interface ReprodutorMusical{
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface AparelhoTelefonico{
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet{
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    String musicaAtual;
    String numeroLigacao;
    String paginaAtual;

    public void tocar(){
        System.out.println("Tocando Musica: "+ musicaAtual);
    }

    public void pausar(){
        System.out.println("Musica Pausada");
    }

    public void selecionarMusica(String musica){
        musicaAtual = musica;
        System.out.println("Musica selecionada: "+ musica);
    }

    public void ligar(String numero){
        numeroLigacao = numero;
        System.out.println("Ligando para: "+ numero);
    }

    public void atender(){
        System.out.println("Atendendo Ligacao...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de Voz iniciado");
    }

    public void exibirPagina(String url){
        paginaAtual = url;
        System.out.println("Exibindo Pagina: "+ url);
    }

    public void adicionarNovaAba(){
        System.out.println("Nova Aba aberta");
    }

    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }
}

public class Main{
    public static void main(String[] args){

        Iphone celular = new Iphone();

        celular.selecionarMusica("Minha Musica");
        celular.tocar();

        System.out.println("----------");

        celular.ligar("123456789");
        celular.atender();
        celular.iniciarCorreioVoz();

        System.out.println("----------");

        celular.exibirPagina("google.com");
        celular.adicionarNovaAba();
        celular.atualizarPagina();
    }
}
