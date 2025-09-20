package Lista01;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeLista01C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int idade;
        String nome;
        double altura;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        altura = scanner.nextDouble();


        System.out.println("Seu nome é: " + nome + " / Sua idade é : " + idade + " / Sua altura é: " + altura );


        scanner.close();
    }

}
