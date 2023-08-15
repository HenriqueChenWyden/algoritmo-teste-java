import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicia o Scanner
        Scanner sc1 = new Scanner(System.in);
        double n1, n2;
        double media, soma;
        String nome, sobrenome;

        System.out.println("Bem vindo!");

        System.out.print("Seu nome: ");
        nome = sc1.next();

        System.out.print("Seu sobrenome: ");
        sobrenome = sc1.next();

        System.out.print("Digite a sua primeira nota: ");
        n1 = sc1.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = sc1.nextDouble();

        soma = n1 + n2;
        media = soma / 2;


        System.out.println("\nNome e Sobrenome: " + nome + " " + sobrenome);
        System.out.println("N1: " + n1 );
        System.out.println("N2: " + n2 );
        System.out.println("Média: " + media);

        if (media >= 9 && media <= 10){
            System.out.println("Aprovado com Excelência");
        } else if (media > 10){
            System.out.println("Média acima de 10, tente novamente.");
        }
        if (media < 9 && media >= 7){
            System.out.println("Aprovado.");
        } else if (media <= 6 && media >= 5){
            System.out.println("Precisará fazer a recuperação.");
        }
        else if (media < 5 && media >= 0){
            System.out.println("Reprovado, tente novamente na próxima.");
        }

    }
}