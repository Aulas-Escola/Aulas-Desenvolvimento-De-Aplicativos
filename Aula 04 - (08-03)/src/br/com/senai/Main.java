package br.com.senai;

import br.com.senai.model.Banco;

public class Main {

    public static void main(String[] args) {
        Banco conta1 = new Banco(123, "Igor Medeiros", 2000);
        Banco conta2 = new Banco(110, "Matheus Mello");
        conta1.boasVindas();
        conta1.setNome("Igor Medeiros Ribeiro");

        System.out.println("\n" + conta1.depositar(100));
        System.out.println(conta1.sacar(20));

        conta2.boasVindas();
    }

}
