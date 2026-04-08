import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final ArrayList<String> userData = Menus.criar_user();
        User user1 = new User(userData);

        while(true) {
            switch (Menus.entrada()) {
                case 1:
                    System.out.print("Digite seu email: ");
                    String email = sc.nextLine();
                    System.out.print("Digite sua senha: ");
                    String senha = sc.nextLine();
                    if(user1.getSenha().equals(senha)) {
                        System.out.println("Parábens, você logou");
                    } else {
                        System.out.println("Senha inválida");
                    }
                    return;
                case 2:
                    System.out.println(user1.getNome()+ " Email: " + user1.getEmail());
                    break;
                case 0:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + Menus.entrada());
            }
        }

    }
}

class Menus {
    static void main() {
    }

    static int entrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Logar usuário");
        System.out.println("2. Ver usuários");
        System.out.println("0. Sair");
        System.out.println("Escolha um opção:");
        int opc = sc.nextInt();
        return opc;
    }

    static ArrayList<String> criar_user() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String  nome = sc.nextLine();
        System.out.print("Insira seu email: ");
        String email = sc.nextLine();
        System.out.print("Insira sua senha: ");
        String senha = sc.nextLine();
        ArrayList<String> user = new ArrayList<>();
        user.add(nome);
        user.add(email);
        user.add(senha);
        return user;
    }
}