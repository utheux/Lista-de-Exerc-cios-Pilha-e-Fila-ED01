package exercicio03;

import java.util.Queue;

public class Aviao {
    String nome;
    Integer numero;

    public Aviao(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
