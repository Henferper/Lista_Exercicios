import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira os 5 números inteiros
        System.out.println("Digite 5 números inteiros:");

        int maior = Integer.MIN_VALUE; // Inicializa o maior número com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicializa o menor número com o maior valor possível

        // Loop para ler os números e determinar o maior e o menor
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();

            // Atualiza o maior número, se necessário
            if (numero > maior) {
                maior = numero;
            }

            // Atualiza o menor número, se necessário
            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibe o maior e o menor número digitado
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);

    }
}
