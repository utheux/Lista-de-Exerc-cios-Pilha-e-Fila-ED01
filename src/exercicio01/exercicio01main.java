package exercicio01;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class exercicio01main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um conjunto de caracteres");
        String caracters = scanner.nextLine();
        Stack<String> pilhaDeCaracteres = new Stack<>();
        String palavraReversa = "";

        for (char c :caracters.toCharArray()) {
            pilhaDeCaracteres.push(String.valueOf(c));
        }

        for (int i = 0; i< caracters.length(); i++){
            String ultimoChar = pilhaDeCaracteres.peek();
            pilhaDeCaracteres.pop();
            palavraReversa += ultimoChar;

        }

        System.out.println(palavraReversa);

        if (palavraReversa.equals(caracters)){
            System.out.println("é um palíndromo");
        } else {
            System.out.println("não é um palíndromo");
        }






    }
}
