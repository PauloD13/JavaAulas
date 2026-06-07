package pessoa;

public class Professor extends Pessoa implements Autenticavel{
    Professor(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String apresentar() {
        return String.format("Olá, eu sou o professor: %s, e eu tenho: %d de idade", this.getNome(), this.getIdade() );
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals( "1234");
    }
}

interface Autenticavel{
    boolean autenticar(String senha);
}