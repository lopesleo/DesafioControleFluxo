import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            Contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("Ocorreu um erro inesperado: " + exception.getMessage());
        }
    }

    static void Contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser maior que o segundo");
        }
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}