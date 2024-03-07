import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, resultado, resposta;

        for (j = 1; j <= 10; j++) {
            boolean acertou = true;
            for (i = 1; i <= 10; i++) {
                resultado = i * j;
                System.out.print(i + " X " + j + " = ");
                resposta = in.nextInt();
                if (resultado != resposta) {
                    System.out.println("Errou!");
                    acertou = false;
                    break;
                }
            }
            if (!acertou) {
                System.out.println("O jogo acabou.");
                break;
            }
        }
    }
}
