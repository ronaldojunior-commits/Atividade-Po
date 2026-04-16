interface Autenticacao {
    boolean login(String usuario, String senha);
}

class UsuarioComum implements Autenticacao {
    public boolean login(String usuario, String senha) {
        return usuario.equals("user") && senha.equals("123");
    }
}

class Administrador implements Autenticacao {
    public boolean login(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("admin123");
    }
}