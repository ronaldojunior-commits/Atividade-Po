interface Notificacao {
    void enviarMensagem(String msg);
}

class Email implements Notificacao {
    public void enviarMensagem(String msg) {
        System.out.println("Enviando EMAIL: " + msg);
    }
}

class SMS implements Notificacao {
    public void enviarMensagem(String msg) {
        System.out.println("Enviando SMS: " + msg);
    }
}