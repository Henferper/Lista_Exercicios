import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long valor, i, resultado = 1;
        System.out.println("Digite um Número Inteiro:");
        valor = in.nextLong();
        for (i = 1; i <= valor; i++) {
            resultado *= i;
        }
        System.out.println("O fatorial de " + valor + " é: " + resultado);
    }
}
