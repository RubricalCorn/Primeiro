package primeiro1;
import java.util.Scanner;

public class PrimeiroProjeto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}