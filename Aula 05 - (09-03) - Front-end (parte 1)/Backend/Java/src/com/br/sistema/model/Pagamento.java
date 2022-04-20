package com.br.sistema.model;

public class Pagamento {

    private String tipoDePagamento;
    private double valor;

    public Pagamento(String tipoDePagamento, double valor) {
        this.tipoDePagamento = tipoDePagamento;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nTipo De Pagamento: " + tipoDePagamento +
                "\nValor: " + valor;
    }
}
