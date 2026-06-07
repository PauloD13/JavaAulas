import pessoa.Professor;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Professor> professores = new ArrayList<>();

        int n1 = 5;

        if (n1+1 >= professores.size() || n1 < 0) {
            System.out.println("Index fora do escopo");
        } else {
            System.out.println(professores.get(n1).getNome());
        }
    }
}