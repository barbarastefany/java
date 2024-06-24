import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = entrada.nextInt();

        System.out.println("Escolha uma operação: ");
        System.out.println("[1] - Somar");
        System.out.println("[2] - Subtrair");
        System.out.println("[3] - Dividir");
        System.out.println("[4] - Multiplicar");
        int operacao = entrada.nextInt();

        System.out.println("Você escolheu a operação: "+ operacao);

        switch (operacao) {
            case 1:
                System.out.println("O resultado é: "+ (n1 + n2));
                break;
            case 2:
                System.out.println("O resultado é: "+ (n1 - n2));
                break;
            case 3:
                if (n2 == 0) {
                    System.out.println("Esse número não é divisível por zero.");
                } else {
                    System.out.println("O resultado é: "+ (n1 / n2));
                }
                break;
            case 4:
                System.out.println("O resultado é: "+ (n1 * n2));
                break;
            default:
                    System.out.println("Operação inválida, tente novamente.");
        }
        entrada.close();
    }
}
