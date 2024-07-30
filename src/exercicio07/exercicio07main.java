package exercicio07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class exercicio07main {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < 20; i++){
            fila.add(i);
        }

        for (Integer elemento : fila) {
            System.out.print(elemento + " ");
        }

        System.out.println("\n");

        while (!fila.isEmpty()){
            pilha.push(fila.remove());
        }

        while (!pilha.isEmpty()){
            fila.add(pilha.pop());
        }

        for (Integer elemento : fila) {
            System.out.print(elemento + " ");

        }





    }



}
