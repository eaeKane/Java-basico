import java.util.Scanner;

public class Projetos {

    public static void Ex01(String[] args) {
    System.out.println("Exercicio 1: Crie um programa que exiba todos os números pares entre 0 e 100.");
        for (int i = 0; i < 100; i++) {
             if (i % 2 == 0) {
                System.out.println(i);
             }
        }
    }

    public static void Ex02(String[] args){
        System.out.println("Exercicio 2: Desenvolva um programa que solicite ao usuário para inserir um número inteiro positivo e, em seguida \n exiba todos os números pares entre 0 e o núme-ro inserido. ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro e positivo: ");
        int num = sc.nextInt();
        System.out.println("O numero digitado foi " + num);

        for (int i = 0; i < num; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
   
    }

    public static void Ex03(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercício 3: Crie um programa que solicite ao usuário para inserir uma palavra \n e, em seguida, exiba cada letra da palavra em uma linha separada.");
        System.out.println("Digite uma palavra qualquer: ");

        String palavra = sc.nextLine();

        int tamanho_palavra = palavra.length();

        for (int i = 0; i < tamanho_palavra ; i++ ){
            System.out.println(palavra.charAt(i));
        }
    
    }

    public static void Ex04(String[] args){
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("Exercicio 4: Desenvolva um programa que solicite ao usuário para inserir um número inteiro positivo \n e, em seguida, exiba a soma de todos os números entre 1 e o número inserido.");
        System.out.println("__________________________________________");
=======
        System.out.println("Exercicio 4: Desenvolva um programa que solicite ao usuário para inserir um número in-teiro positivo \n e, em seguida, exiba a soma de todos os números entre 1 e o número inserido.");
        System.out.println("_____________________________________________")
>>>>>>> d20e923b6af11c64917a08bd9562cc32a2bfc605
        
        System.out.println("Digite um número inteiro positivo qualquer: ");
        int num = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < num; i++) {
            soma = i + i;
            System.out.println(soma);
        }
  
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int exercicio;
        
    do {
        System.out.println("Bem vindo ao sistema de exercicios básicos na linguagem Java!");
        System.out.println("Escolha o exercicio que deseja ver");
        System.out.println("_________________________");
        System.out.println("| Exercicio 1:           |");
        System.out.println("| Exercicio 2:           |");
        System.out.println("| Exercicio 3:           |");
        System.out.println("| Exercicio 4:           |");
        System.out.println("| Exercicio 5:           |");
        System.out.println("| Exercicio 6:           |");
        System.out.println("| Exercicio 7:           |");
        System.out.println("| Exercicio 8:           |");
        System.out.println("| Exercicio 9:           |");
        System.out.println("| Exercicio 10:          |");
        System.out.println("|________________________|");
        exercicio = sc.nextInt();
        
    
        
        switch (exercicio) {
            case 1:
            Ex01(args); break;

            case 2:
            Ex02(args); break;

            case 3:
            Ex03(args); break;

            case 4:
            Ex04(args); break;

            case 0:
            System.out.println("Obrigado por visualizar o sistema de exercicios básicos em Java!"); break;

            default:
            System.out.println("Opção inválida!"); break;
        }
} while (exercicio != 0);
sc.close();
}
}
