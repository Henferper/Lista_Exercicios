import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int valor = in.nextInt();
        boolean Primo = true;

        if (valor <= 1) {
            Primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(valor); i++) {
                if (valor % i == 0) {
                    Primo = false;
                    break;
                }
            }
        }

        if (Primo) {
            System.out.println("O número " + valor + " é primo");
        } else {
            System.out.println("O número " + valor + " não é primo");
        }
    }
}
