package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */

//Lucas Nunes - Tia 31224490
public class PapelMoeda {

    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
