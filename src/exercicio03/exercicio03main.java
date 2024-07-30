package exercicio03;

import java.util.LinkedList;
import java.util.Queue;

public class exercicio03main {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao("Joaquim474", 7845);
        Aviao aviao2 = new Aviao("Boing1232", 122323);
        Aviao aviao3 = new Aviao("babye234", 2334);


        Queue<Aviao> filaDeAvioes = new LinkedList<>();

        filaDeAvioes.add(aviao1);
        filaDeAvioes.add(aviao2);

        System.out.println(retornaNumeroDeAvioesNaFila(filaDeAvioes));
        System.out.println(autorizaDecolagem(filaDeAvioes));
        System.out.println(retornaNumeroDeAvioesNaFila(filaDeAvioes));
        System.out.println(adicionaNaFila(filaDeAvioes,aviao3));
        System.out.println(retornaNumeroDeAvioesNaFila(filaDeAvioes));
        retornaOsAvioes(filaDeAvioes);
        System.out.println(retornaCaracteristicasDoPrimeiroAviao(filaDeAvioes));


    }

    public static int retornaNumeroDeAvioesNaFila(Queue<Aviao> filaDeAvioes){
        return filaDeAvioes.size();
    }

    public static Aviao autorizaDecolagem(Queue<Aviao> filaDeAvioes){
        return filaDeAvioes.remove();

    }

    public static boolean adicionaNaFila(Queue<Aviao> filaDeAvioes, Aviao aviao){
        return filaDeAvioes.add(aviao);
    }

    public static void retornaOsAvioes(Queue<Aviao> filaDeAvioes){
        for (Aviao aviao : filaDeAvioes) {
            System.out.println(aviao);
        }
    }

    public static Aviao retornaCaracteristicasDoPrimeiroAviao(Queue<Aviao> filaDeAvioes){
        return filaDeAvioes.element();
    }



}
