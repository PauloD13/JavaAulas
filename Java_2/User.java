import java.util.ArrayList;

public class User {
    private String _nome;
    private String _email;
    private String _senha;

    public User(ArrayList<String> userData) {
        setData(userData);
    }

    public void setData(ArrayList<String> userData) {
        this._nome = userData.get(0);
        this._email = userData.get(1);
        this._senha = userData.get(2);
    }

    public String getNome() {
        return _nome;
    }
    public String getEmail() {
        return _email;
    }
    public String getSenha() {
        return _senha;
    }
}
