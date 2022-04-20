package com.br.sistema;

import com.br.sistema.model.User;

public class Main {

    public static void main(String[] args) {

        User usuario = new User("Igor", "103-123-432.23", "Estrada ABC", "igor_m_ribeiro@estudante.sc.senai.br", "(48) 99627-9325");
        usuario.imprimir();

        System.out.println("\n/* O pagamento só é mostrado caso tenha sido adicionado, se não for adicionado não é mostrado */");

        usuario.pagar("Cartão de Crédito", 1020);
        usuario.imprimir();
    }

}
