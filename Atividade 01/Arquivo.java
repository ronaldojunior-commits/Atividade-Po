interface Arquivo {
    void abrir();
    void fechar();
}

class ArquivoTexto implements Arquivo {
    public void abrir() {
        System.out.println("Abrindo arquivo de texto");
    }

    public void fechar() {
        System.out.println("Fechando arquivo de texto");
    }
}

class ArquivoImagem implements Arquivo {
    public void abrir() {
        System.out.println("Abrindo imagem");
    }

    public void fechar() {
        System.out.println("Fechando imagem");
    }
}