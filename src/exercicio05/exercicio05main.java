package exercicio05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class exercicio05main {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            int numeroAleatorio = random.nextInt(10) + 1;
            if (!fila.contains(numeroAleatorio)){
                fila.add(numeroAleatorio);
            } else {
                pilha.push(numeroAleatorio);
            }
        }

        System.out.println("====FILA====");
        for (int numero : fila) {
            System.out.println(numero);
        }

        System.out.println("====PILHA====");
        for (int numero : pilha){
            System.out.println(numero);
        }
    }
}
