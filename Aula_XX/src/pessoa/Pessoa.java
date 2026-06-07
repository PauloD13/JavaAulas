package pessoa;

public abstract class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = (idade>0)?idade:this.idade;
    }

    public String apresentar() {
        return String.format("Olá, meu nome é: %s, e eu tenho: %d de idade", this.getNome(), this.getIdade() );
    }

    protected abstract boolean autenticar(String senha);
}
