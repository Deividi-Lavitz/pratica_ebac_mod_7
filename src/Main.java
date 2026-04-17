import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input;
        int numUm;
        int numDois;
        String mensagem;

        System.out.println("Olá, é nescessário digitar dois numeros inteiros. Começe digitando o primeiro numero: ");
        input = scanner.nextLine().trim();

        numUm = Integer.parseInt(input);

        System.out.println("Agora digite o segundo numero: ");
        input = scanner.nextLine().trim();

        numDois = Integer.parseInt(input);

        if (numUm == numDois){
            System.out.println("Os números são iguais!");
        } else{
            mensagem = numUm > numDois ? "O maior número é: " + numUm : "O maior número é: " + numDois;
            System.out.println(mensagem);
        }

        scanner.close();

    }
}
